package com.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.javaConfig")
public class JavaConfig {
	@Bean
	public Teacher getTeacher()
	{
		return new Teacher();
	}
	@Bean
	public Student getStudents()
	{
		Student student=new Student(getTeacher());
		return student;
	}

}