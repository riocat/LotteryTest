package com.yang.lotterytest.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.Service.UserService;
import com.yang.lotterytest.util.JsonResult;
import com.yang.lotterytest.util.StaticFinalValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by rio on 2018/9/12.
 */
@Controller
public class SSOLoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private JedisPool jedisPool;

    // 一天后过期
    private static final int expiredTime = 60 * 60 * 24;

    private ObjectMapper om = new ObjectMapper();

    @RequestMapping(value = "/SSO/SSORegister")
    public JsonResult registerMothed(HttpServletRequest request) {
        JsonResult jr = new JsonResult();

        return jr;
    }

    @RequestMapping(value = "/SSO/SSOLogin")
    public String SSOLoginMothed(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {

        Logger logger = LoggerFactory.getLogger(SSOLoginController.class);

        try {
            User user = userService.getUserByName(request.getParameter("username"));

            if (!user.getPassword().equals(request.getParameter("password"))) {
                return "forward:/WEB-INF/jsp/SSOLoginFail.jsp";
            }

            HttpSession session = request.getSession(true);
            String sessionID = session.getId();
            logger.info("sessionID : " + sessionID);
            session.setAttribute("user", user);

            // jackson
            ObjectMapper om = new ObjectMapper();
            Jedis jedis = jedisPool.getResource();
            String userStr = om.writeValueAsString(user);
            jedis.set(sessionID, userStr);
            jedis.expire(sessionID, expiredTime);
            logger.info("userStr :" + userStr);

            // 设置单点登录使用的token
            Cookie cookie = new Cookie(StaticFinalValue.SSO_TOKEN, sessionID);
            cookie.setPath("/");
            response.addCookie(cookie);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.toString(), e);
            throw e;
        }

        return "forward:/WEB-INF/jsp/SSOLoginSuc.jsp";
    }

}
