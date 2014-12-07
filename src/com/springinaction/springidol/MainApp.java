package com.springinaction.springidol;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("poeticDuke");
		performer.perform();

	}

}
