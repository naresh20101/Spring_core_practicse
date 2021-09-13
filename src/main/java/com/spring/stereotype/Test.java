package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/stereotype/stereotypeConfig.xml");
		Student s=context.getBean("student",Student.class);
		System.out.println(s);
		System.out.println(s.getAddresses());
		System.out.println(s.hashCode());
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1.hashCode());

	}

}
