package com.demo.dooho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	String goPage() {
		
		
		return "index";
	}
	
	@RequestMapping("/admin")
	String goPage2() {
		
		
		return "admin";
	}
	
	@RequestMapping("/login")
	String goPage3() {
		
		
		return "login";
	}
}
