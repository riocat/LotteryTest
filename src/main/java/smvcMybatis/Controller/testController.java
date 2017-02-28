package smvcMybatis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import smvcMybatis.Entity.User;

@Controller
@SessionAttributes("user")
//@RequestMapping
public class testController {

	@RequestMapping("test/toTest")
//	@RequestMapping("toTest")
	public ModelAndView toTest(@ModelAttribute("user") User user){
		return new ModelAndView("testJsp/test");
	}
}
