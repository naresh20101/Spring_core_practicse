package com.spring;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddres;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddres() {
		return studentAddres;
	}
	public void setStudentAddres(String studentAddres) {
		this.studentAddres = studentAddres;
	}
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String studentAddres) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddres = studentAddres;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddres=" + studentAddres
				+ "]";
	}

}
