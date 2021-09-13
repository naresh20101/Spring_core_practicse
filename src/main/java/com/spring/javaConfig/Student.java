package com.spring.javaConfig;

public class Student {
	private Teacher teacher;
	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void show()
	{
		this.teacher.display();
		System.out.println("Hello I am Student");
	}

}
