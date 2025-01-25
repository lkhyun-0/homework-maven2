package com.example.demo.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Member;


@Controller	// 컨트롤러니까 알려줘야겠지 
public class UserHomeController {	// 컨트롤러의 역할 요청받는 곳  웨이터임 
	
	
	
	@RequestMapping("/user/home/getInt")
	@ResponseBody
	public int getInt() {
		return  1+2+4+6+8*5;
	}
	
	@RequestMapping("/user/home/getString")
	@ResponseBody
	public String getString() {
		return "하이 " ;
	}
	
	@RequestMapping("/user/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true ;
	}
	
	@RequestMapping("/user/home/getMap")
	@ResponseBody
	public Map getMap() {
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("안녕",11);
		map.put("잘가",22);
		
		
		return map;
	}
	
	@RequestMapping("/user/home/getList")
	@ResponseBody
	public List geList() {
		
		List<String> list = new ArrayList<>();
		
		list.add("문자1");
		list.add("문자2");
		
		return list ;
	}
	


}




	

	

