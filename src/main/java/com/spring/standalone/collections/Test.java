package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/standalone/collections/standaloneCongif.xml");
		Person p=(Person) context.getBean("person");
		System.out.println(p);
	}

}
