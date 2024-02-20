package ex02;

import java.util.Arrays;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex03.Customer;

public class MainClass {
	
	public static void main(String[] args) {
		
		//IOC컨테이너
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		//빈의 이름들 확인
		String [] arr = ctx.getBeanDefinitionNames();
		System.out.println(Arrays.toString(arr));
		
		//빈을 꺼낼때는, 빈의 이름 or, 빈의 타입을 사용하는 reflect기법을 사용합니다.
		
		//1st - 빈의 이름으로 꺼내는 기법
		//Hotel h = (Hotel) ctx.getBean("hotel");
		
		//2nd - reflection 기법
		//Hotel h = ctx.getBean(Hotel.class);
		
		//3rd - 클래스의 정보를 전달해서 사용하는 기법
		Hotel h = ctx.getBean("hotel", Hotel.class);
		h.getChef().cooking();
		
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		System.out.println(dao.getDataSource().getUrl());
		
		//IOC컨테이너 안에 빈들은 자동으로 싱글톤 형식을 띄게 합니다.
		//만약 dao와 dao2를 다르게 생성하고 싶다면 xml파일에서 <bean scope="prototype" >를 설정해주면 됩니다.
		MemberDAO dao2 = ctx.getBean(MemberDAO.class);
		System.out.println(dao == dao2);
		
		Customer c1 = ctx.getBean(Customer.class);
		System.out.println( c1.getList().toString() );
		
		
		
		
	}
	
}
