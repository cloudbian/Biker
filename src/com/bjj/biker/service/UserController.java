package com.bjj.biker.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjj.biker.service.model.User;

/**
 *Author:cloudbian
 *CreateTime:2014年7月28日下午4:51:45
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("id") String id){
		System.out.println(id);
		User user = new User();
		user.setId(id);
		user.setUserName("test");
		user.setPassword("123456");
		return user;
	}
}
