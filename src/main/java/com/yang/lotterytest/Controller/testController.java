package com.yang.lotterytest.Controller;

import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.util.DateUtil;
import com.yang.lotterytest.util.FtpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;

@Controller
@SessionAttributes("user")
//@RequestMapping
public class testController {

    @RequestMapping("test/toTest")
//	@RequestMapping("toTest")
    public ModelAndView toTest(@ModelAttribute("user") User user) {
        return new ModelAndView("testJsp/test");
    }

    @RequestMapping("test/uploadtest")
    public void uploadFile(@RequestParam MultipartFile file, HttpServletResponse response) {
        boolean flag = false;

        if (!file.isEmpty()) {
            try {
                flag = FtpUtil.uploadFile(file.getOriginalFilename(), file.getOriginalFilename(), file.getInputStream(), DateUtil.getDateString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        PrintWriter os = null;
        try {
            os = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (flag) {
            os.print("success");
            return;
        }
        os.print("failed");
    }

    @RequestMapping("test/downloadtest")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response) {
        response.reset();
        String agent = request.getHeader("user-agent");
        try {
        if (agent.contains("Firefox")) {
            response.setHeader("Content-Disposition", "attachment; filename=\"" + new String(new String("catalina.txt").getBytes("GB2312"), "ISO-8859-1"));
        } else {
            response.setHeader("Content-Disposition", "attachment; filename=\"" + URLEncoder.encode("catalina.txt", "UTF-8"));
        }

/*            if (agent.contains("Firefox")) {
                response.setHeader("Content-Disposition", "attachment;");
            } else {
                response.setHeader("Content-Disposition", "attachment;");
            }*/

            FtpUtil.downloadFile("1111/catalina.txt", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
