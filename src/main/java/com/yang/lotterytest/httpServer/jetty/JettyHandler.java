package com.yang.lotterytest.httpServer.jetty;

/**
 * Created by rio on 2019/3/15.
 */

import com.google.gson.Gson;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rio on 2019/3/15.
 */
public class JettyHandler extends AbstractHandler {

    @Override
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        Map parameterMap = new HashMap();
        httpServletRequest.setCharacterEncoding("utf-8");
        String requestType = httpServletRequest.getMethod();
        switch (requestType) {
            case "GET":
                parameterMap = getGetParameter(httpServletRequest.getQueryString());
                break;
            case "POST":
                BufferedReader br = httpServletRequest.getReader();
                StringBuilder sb = new StringBuilder();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    sb.append(temp);
                }
                String type = httpServletRequest.getHeaders("Content-Type").toString();
                if (type.lastIndexOf("application/json") != -1) {
                    Gson gson = new Gson();
                    parameterMap = gson.fromJson(sb.toString(), Map.class);
                } else if (type.lastIndexOf("application/x-www-form-urlencoded") != -1) {
                    parameterMap = getGetParameter(sb.toString());
                }

                break;
            default:
                break;
        }

        sendResponse(httpServletResponse, parameterMap);
    }

    private Map getGetParameter(String rawQuery) {
        Map<String, String> pm = new HashMap<String, String>();
        if (rawQuery != null && !"".endsWith(rawQuery)) {
            String[] entrys = rawQuery.split("&");
            for (String entry : entrys) {
                String[] en = entry.split("=");
                if (en.length > 1) {
                    pm.put(en[0], en[1]);
                } else {
                    pm.put(en[0], "");
                }

            }
        }

        return pm;
    }

    private void sendResponse(HttpServletResponse httpServletResponse, Map parameterMap) throws IOException {
        httpServletResponse.addHeader("Content-Type", "application/Json;charset=utf-8");
        httpServletResponse.setStatus(200);
        OutputStream os = httpServletResponse.getOutputStream();

        byte[] ba = "{\"name\":\"LZX\"}".getBytes("utf-8");
        try {
            os.write(ba);
            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}