package com.siddu.maven.mvc;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FirstControl {
	public FirstControl()
	{
		System.out.println("Create\t"+this.getClass().getCanonicalName());
	}
	
	
	
	@RequestMapping("/first")
	public String onFirst(HttpServletRequest request) 
	{
		System.out.println("invoked onFirst");
		String Message = request.getParameter("message");
		System.out.println("Message:"+Message);
		String Email = request.getParameter("email");
		System.out.println("Email:"+Email);
		String file = request.getParameter("file");
		System.out.println("File:"+file);
		return "/index.jsp";

	}
}
