package com.springtest.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*import org.springframework.context.support.ClassPathXmlApplicationContext;*/

import com.beanconfiguration.Appconfig;
import com.beanconfiguration.Samsung;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("Springtest.xml");
		 * 
		 * Vehicle obj=(Vehicle) context.getBean("bike"); obj.drive();
		 * 
		 * 
		 * ++++++++++++++ Autowired case+++++++++++
		 * 
		 * Tyre t=(Tyre) context.getBean("tyre"); System.out.println(t);
		 */
		System.out.println("Hello World!");
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Samsung samsung=context.getBean(Samsung.class);
		samsung.config();
	}
}
