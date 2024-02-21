package com.simple.controller;

import java.sql.Array;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/request") //�� ��Ʈ�ѷ� ���� ��û�� /aaa
public class RequestController {
	
	//화면
//	@RequestMapping("/ex01")
//	public String ex01() {
//		return "/request/ex01"; //return "ȭ���� ���";
//	}
	
	//화면을 띄우는 요청
	@RequestMapping( value="/ex01" )
	public void ex01() {
		
	}
	
	//get방식만 허용함 RequestMethod.GET
	//post방식만 허용함 RequestMethod.POST
	//안적으면 둘다 허용함
	@RequestMapping(value = "/basic", method=RequestMethod.POST)
	public void basic() {
		System.out.println("실행함");
	}
	
	@RequestMapping ("/ex02")
	public String ex02() {
		return "request/ex02";
	}
	
	@RequestMapping (value="/param", method=RequestMethod.POST) 
	public String param(HttpServletRequest request) { //ex02로부터 데이터를 받음 
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("age"));
		System.out.println(Arrays.toString( request.getParameterValues("inter") ));
		return "request/ex02_result";
	}
	
	
}
