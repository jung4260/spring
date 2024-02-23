package com.simple.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.MemberVO;


@Controller
@RequestMapping("/response")
public class ResponseController {

		
	@RequestMapping("/ex01")
	public String ex01(Model model) {
		
		//request.setAttribute(키,값)
		model.addAttribute("name", "홍길동");
		model.addAttribute("list", Arrays.asList(1,2,3,4));
		model.addAttribute("age", 20);
		
		return "response/ex01";
	}
	
	
	//ModelAndView - 데이터와 뷰의 정보를 함께 넘기는 방식
	//ex01페이지에서 ahref=ex02로 넘어가면 ModelAndView에 넣고 mv.addobject에 정보를 넣고 ex02로 다시 데이터를 뿌려준다
	@RequestMapping("/ex02")
	public ModelAndView ex02() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "이순신");
		mv.addObject("age", 20);
		mv.setViewName("response/ex02");
		
		return mv;
	}
	
	
	//ModelAttribute - id를 받고 id이름으로 model을 넘긴다.
//	@RequestMapping("/ex03")
//	public String ex03(@ModelAttribute("id") String id) {
//		System.out.println("Controller" + id);
//		return "response/ex03";
//	}
	
	//public String ex03(MemberVO vo)은 id=aaa123을 vo로 가지고 넘어 올수 있다.
	//그때 ModelAttribute(변수)를 통해 vo의 값을 가지고 ex03에 데이터를 뿌려 줄 수 있다.
	@RequestMapping("/ex03") //vo로 값을 받아서 info이름으로 model을 넘긴다
	public String ex03(@ModelAttribute("info") MemberVO vo) {
		System.out.println(vo.toString());
		return "response/ex03";
	}
	
	
	////////////////////////////////////////////////////////////////////////////
	//redirect와 redirectAttribute
	
	
	//화면처리
	@RequestMapping("redirect_login")
	public String loginView() {
		
		System.out.println("redirect:/실행됨~!");
		
		return "response/redirect_login";
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.POST)
	public String loginForm( @RequestParam("id") String id,
							 @RequestParam("pw") String pw,
							 RedirectAttributes ra ) {
		if(id.equals(pw)) {
			return "response/redirect_ok";
		} else {
			//model.addAttribute("msg", "check your id and password");
			ra.addFlashAttribute("msg", "아이디 비밀번호를 확인하세요"); //Redirect시에 1회성으로 데이터 사용이 가능
			return "redirect:/response/redirect_login";
		}
	}
	
	
	
	
}
