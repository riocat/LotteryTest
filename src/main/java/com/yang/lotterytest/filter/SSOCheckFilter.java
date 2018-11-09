package com.yang.lotterytest.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.util.StaticFinalValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rio on 2018/9/13.
 */
public class SSOCheckFilter implements Filter {

    private List<String> loginPaths;

    private JedisPool jedisPool;

    private ObjectMapper om = new ObjectMapper();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String includePath = filterConfig.getInitParameter("includePathPatterns");
        String[] temp = includePath.split(",");
        this.loginPaths = Arrays.asList(temp);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Logger logger = LoggerFactory.getLogger(SessionCheckFilter.class);
        logger.info("SSOCheckFilter working");

        try {
            HttpServletRequest hsr = (HttpServletRequest) request;
            String servletPath = hsr.getServletPath();
            for (String loginPath : loginPaths) {
                if (servletPath.matches(loginPath)) {

                    HttpSession session = hsr.getSession();

//                User user = (User) session.getAttribute("user");

                    User user = null;

                    if (user == null) {
                        List<Cookie> cookies = Arrays.asList(hsr.getCookies()).stream().filter((cookie) -> {
                                    return StaticFinalValue.SSO_TOKEN.equals(cookie.getName());
                                }
                        ).collect(Collectors.toList());

                        if (cookies.size() == 1) {
                            String token = cookies.get(0).getValue();

                            if (this.jedisPool == null) {
                                WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(hsr.getServletContext());
                                this.jedisPool = (JedisPool) ctx.getBean("jedisPool");
                            }

                            Jedis jedis = this.jedisPool.getResource();
                            String userStr = jedis.get(token);

                            logger.info("SSOCheckFilter userStr :" + userStr);

                            if (!StringUtils.isEmpty(userStr))
                                hsr.getSession().setAttribute("user", om.readValue(userStr, User.class));
                        }
                    }
                }
            }

            chain.doFilter(hsr, response);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.toString(), e);
            throw e;
        }

    }

    @Override
    public void destroy() {

    }
}
