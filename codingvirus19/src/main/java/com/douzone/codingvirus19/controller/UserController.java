package com.douzone.codingvirus19.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.douzone.codingvirus19.service.UserService;
import com.douzone.codingvirus19.vo.UserVo;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public String User(Model model) {
//		List <UserVo> userLists = userService.findAll();
//		model.addAttribute("lists", userLists);
		return "user/login";
	}

}
