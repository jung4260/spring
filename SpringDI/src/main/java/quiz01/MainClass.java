package quiz01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Computer computer = (Computer) ctx.getBean(Computer.class);
		computer.computerInfo();
	}

}