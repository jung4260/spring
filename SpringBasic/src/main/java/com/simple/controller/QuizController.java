package com.simple.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.MemberVO;
import com.simple.command.QuizVO;

@Controller
@RequestMapping ("/quiz")
public class QuizController {

	
	@RequestMapping("/quiz01")
	public String quiz01 () {
		
		return "quiz/quiz01";
	}
	
	@RequestMapping(value="/sendBirth", method=RequestMethod.POST)
	public String quiz01_ok(@ModelAttribute("info") QuizVO vo) {
		
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02(Model model) {
		List <MemberVO> list = new ArrayList <>();
		list.add( new MemberVO("aaa123", "홍길동", 20, null));
		list.add( new MemberVO("ba123", "홍길동", 30, null));
		list.add( new MemberVO("ccc123", "홍길동", 40, null));
		
		model.addAttribute("list", list);
		
		return "quiz/quiz02";
	}
	
	@RequestMapping("/quiz02_ok")
	public String quiz02_ok(@ModelAttribute("id") String id) {
		
		return "quiz/quiz02_ok";
	}
	
	
	
}
