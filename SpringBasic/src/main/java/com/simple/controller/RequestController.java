package com.simple.controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;

@Controller
@RequestMapping("/request") //�� ��Ʈ�ѷ� ���� ��û�� /aaa
public class RequestController {
	
	//화면
//	@RequestMapping("/ex01")
//	public String ex01() {
//		return "/request/ex01"; //return "ȭ���� ���";
//	}
	
	//화면을 띄우는 요청
	//void return - 들어오는 경로 = 나가는 경로
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
	
	//Form의 요청 - 전통적인 방법
//	@RequestMapping (value="/param", method=RequestMethod.POST) 
//	public String param(HttpServletRequest request) { //ex02로부터 데이터를 받음 
//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("name"));
//		System.out.println(request.getParameter("age"));
//		System.out.println(Arrays.toString( request.getParameterValues("inter") ));
//		return "request/ex02_result";
//	}
	
//	//@ReqeustParam - 반드시 필수로 넘겨야하는 파라미터가 됩니다. (값이 없으면 400 에러 - client쪽 에러)
//	@RequestMapping (value = "/param", method=RequestMethod.POST)
//	public String param(@RequestParam("id") String id,
//						@RequestParam("name") String x,
//						@RequestParam("age") int y,
//						@RequestParam(value="inter", 
//									  required = false,
//									  defaultValue = "" ) ArrayList<String> list) {
//		System.out.println(id);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(list.toString());
//		return "request/ex02_result";
//	}
	
	//VO객체를 이용한 자동맵핑
	@RequestMapping("/param")
	public String param(MemberVO vo) {
		
		System.out.println(vo.toString());
		return "request/ex02_result";
	}
	
	
}
