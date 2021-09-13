package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String arg[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ref/refCongif.xml");
		A temp=(A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
	}

}
