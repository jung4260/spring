package ex05.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;
import quiz01.Computer;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cooking();
		
		
		Computer comp = ctx.getBean(Computer.class);
		comp.computerInfo();
		
	}
	
}
