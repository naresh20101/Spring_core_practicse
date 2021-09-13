package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String arg[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycle.xml");
		//Samoosa s=(Samoosa) context.getBean("s1");
		//System.out.println(s);
		context.registerShutdownHook();
		//Pepsi p=(Pepsi) context.getBean("p1");
		//System.out.println(p);
		//context.registerShutdownHook();
		Examle e=(Examle) context.getBean("e1");
		System.out.println(e);
	}

}
