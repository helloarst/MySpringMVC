package com.tongtong.springmvc.web.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tongtong.springmvc.annotation.TTAutowired;
import com.tongtong.springmvc.annotation.TTController;
import com.tongtong.springmvc.annotation.TTRequestMapping;
import com.tongtong.springmvc.annotation.TTRequestParam;
import com.tongtong.springmvc.entity.User;
import com.tongtong.springmvc.web.service.IUserService;

@TTController
@TTRequestMapping("/user")
public class UserController {
	
	@TTAutowired
	private IUserService userService;
	
	@TTRequestMapping("/index")
	public String index(HttpServletRequest request,HttpServletResponse response,
          @TTRequestParam("name")String name) throws IOException{
		String res = userService.get(name);
		System.out.println(name+"=>"+res);
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write(res);
		return "index";
	}
	
	@TTRequestMapping("/list")
	public String list(HttpServletRequest request,HttpServletResponse response)
       throws IOException{
		List<User> users = userService.list();
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write(users.toString());
		return "list";
	}
}