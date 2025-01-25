package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// 컨트롤러니까 알려줘야겠지 
public class UserHomeController {	// 컨트롤러의 역할 요청받는 곳  웨이터임 
	
	@RequestMapping("/user/home/main")
	@ResponseBody
	public String showMain() {
		return "하이 " ;
	}
	
	
	

}
