package cn.neu.laboratory.contoller;

import javax.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.neu.laboratory.entity.User;
import cn.neu.laboratory.servicedao.UserServiceDAO;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserServiceDAO userServiceDAO;
	
	@RequestMapping("/findById.do")
	public ModelAndView findById(@Param("id") int id) {
		
		User user = userServiceDAO.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject(user);
		System.out.println(user.getName());
		mv.setViewName("user");
		return mv;
	}
}
