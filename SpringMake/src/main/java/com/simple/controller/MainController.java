package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MainController extends MultiActionController{
	//Spring version 3 �����ϴ� ��Ʈ�ѷ��� �ϳ���, URL�� ���� ��û��θ� �޾� �� �� ����

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String uri = request.getRequestURI();
		String conpath = request.getContextPath();		
		String path = uri.substring(conpath.length() );
		
		System.out.println("conpath:" +conpath);
		System.out.println("uri:" +uri);
		System.out.println("path:" + path);
		
		if(path.equals("/example/aaa")) {
			System.out.println(path + " �����");
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", "�������� �����ϴ� ������"); //����������
			mv.setViewName("home"); //view���
			
			return mv; //������ ���������� ��ȯ
			
		} else if(path.equals("/example/bbb")) {
			System.out.println(path + " �����");
			ModelAndView mv = new ModelAndView();
			mv.addObject("data", "�������� �����ϴ� ������"); //����������
			mv.setViewName("home2"); //view���
			
			return mv;
			
		}
		
		
		return super.handleRequestInternal(request, response);
	}

	
	
}