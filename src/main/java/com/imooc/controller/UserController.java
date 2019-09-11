package com.imooc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		User user=new User();
		user.setName("imooc2");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setPassword("imooc2");
		
		
		return user;
	}
	
	@RequestMapping("/getUserJson")
	@ResponseBody
	public User getUserJson() {
		User user=new User();
		user.setName("imooc");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setPassword("imooc");
		
		
		return user;
	}
}
