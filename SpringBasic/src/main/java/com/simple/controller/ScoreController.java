package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreServcieImpl;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/score")
public class ScoreController {
	
	//1st 
	//private ScoreService service = new ScoreServcieImpl();
	
	//2nd 스프링 방법
	@Autowired
	@Qualifier("xxx")
	private ScoreService service;
	
	//화면띄우기
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "score/scoreRegist";
	}
	
	@RequestMapping("/scoreList")
	public String scoreList() {
		return "score/scoreList";
	}
	
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		
		return "score/scoreResult";
	}
	
	//등록요청
	@RequestMapping(value="/scoreForm", method=RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		//점수등록작업~~
		service.regist(vo);
		return "redirect:/score/scoreResult";
	}
	
	
}
