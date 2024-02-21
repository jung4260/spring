package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러에는 @Controller 사용합니다.
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("serverTime", new Date ());
		
		
		
		return "home";
	}
}
