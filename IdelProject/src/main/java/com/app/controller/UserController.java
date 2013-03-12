package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.User;
import com.app.service.UserService;


@Controller
@RequestMapping("/list*")
public class UserController {
	
	@Autowired
	UserService userService;
	

	ModelAndView mv = new ModelAndView("list");

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView userList(HttpServletRequest request, HttpServletResponse response) {
		if(userService == null){
			System.out.println("USERVICE=NULL");
		}	
//		List<User> list = userService.loadAll();
	
		User user = userService.getUser(3);
		mv.addObject("user", user.getUserName());
	

		return mv;

	}

}
