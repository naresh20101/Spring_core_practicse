package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String arg[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ci/ciCongif.xml");
		Person p= (Person) context.getBean("person1");
		
	  System.out.println(p);
	}

}
