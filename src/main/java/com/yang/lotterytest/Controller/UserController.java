package com.yang.lotterytest.Controller;

import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.Service.UserService;
import com.yang.lotterytest.vo.UserCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yang.lotterytest.util.JsonResult;

@Controller
@SessionAttributes({ "user", "ckeckCode" })
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/logined/user/main")
	public ModelAndView login(@ModelAttribute("user") User user) {
		ModelAndView mav = new ModelAndView("main");
//		mav.addObject("name", user.getUserName());
		return mav;
	}

	// @RequestMapping(value = "main")
	// public ModelAndView login(HttpSession session) {
	// ModelAndView mav = new ModelAndView("main");
	// User user = (User) session.getAttribute("user");
	// if(user != null){
	// mav.addObject("name", user.getUserName());
	// }
	// return mav;
	// }

	@RequestMapping("/user/regester")
	@ResponseBody
	public JsonResult regester(@RequestBody UserCondition condition, @ModelAttribute("ckeckCode") String checkKey) {
		if (!checkKey.equals(condition.getCheckKey())) {
			return new JsonResult(JsonResult.FAIL, null, "");
		}
		int result = 0;
		try {
			result = userService.regester(condition);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == 1) {
			return new JsonResult(JsonResult.SUCCESS, null, "注册成功");
		}
		return new JsonResult(JsonResult.FAIL, null, "注册失败");
	}
}
