package com.yang.lotterytest.Controller;

import com.yang.lotterytest.util.JsonResultStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yang.lotterytest.Service.LotteryService;
import com.yang.lotterytest.util.JsonResult;

@Controller
@SessionAttributes("user")
public class LotteryController {

	@Autowired
	private LotteryService lotteryService;

	@RequestMapping("lottery/toShowLotterys")
	public ModelAndView toShowLotterys() {
		return new ModelAndView("showLotterys");
	}

	@RequestMapping("lottery/showLotterys")
	@ResponseBody
	public JsonResult showLotterys() {
		return new JsonResult(JsonResultStatus.success, lotteryService.showLotterys(), null);
	}
}
