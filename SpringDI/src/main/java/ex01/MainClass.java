package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
//		System.out.println(1);
//		Person p = new Person();
//		System.out.println(	p.getName() ) ;
		
		//스프링의 방식으로 person객체를 불러오기
		//Spring에선 new 키워드 쓰지 않음
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml"); 
		
		Person p = (Person) ctx.getBean("p");
		System.out.println(p.getName());
		
		
		
	}
	
	
}
