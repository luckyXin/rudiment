package dx.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dx.web.common.interfaces.ControllerBase;
import dx.web.model.User;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController implements ControllerBase{
	
	private final String LIST_ACTION = "redirect:/userinfo";

	/**
	 * 列表
	 */
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/user/userInfoIndex");
	}

	/**
	 * 显示
	 */
	public ModelAndView show(HttpServletRequest request, HttpServletResponse response, String id) throws Exception {
		User user = new User();
		user.setId(id);
		user.setUserName("显示");
		return new ModelAndView("/user/userInfoShow", "user", user);
	}

	/**
	 * 编辑
	 */
	public ModelAndView edit(HttpServletRequest request, HttpServletResponse response, String id) throws Exception {
		User user = new User();
		user.setId(id);
		user.setUserName("编辑");
		return new ModelAndView("/user/userInfoEdit", "user", user);
	}
}
