package dx.web.common.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public interface ControllerBase {

	/**
	 * 列表
	 * @param request
	 * @param response
	 * @param obj
	 * @return
	 */
	@RequestMapping
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response);
	
	
	/**
	 * 显示
	 * @param request
	 * @param response
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}")
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response, @PathVariable String id) throws Exception;
	
	/**
	 * 编辑
	 * @param request
	 * @param response
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}/edit")
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response, @PathVariable String id) throws Exception;
	
}
