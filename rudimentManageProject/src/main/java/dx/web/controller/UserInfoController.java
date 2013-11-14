package dx.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dx.web.common.interfaces.ControllerBase;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController implements ControllerBase{
	
	private final String LIST_ACTION = "redirect:/userinfo";

	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		
		return new ModelAndView("/userinfo/userInfoIndex");
	}

	public ModelAndView show(HttpServletRequest request, HttpServletResponse response, String id) throws Exception {
		return null;
	}

	public ModelAndView edit(HttpServletRequest request, HttpServletResponse response, String id) throws Exception {
		return null;
	}
}
