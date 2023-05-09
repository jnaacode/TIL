package edu.kh.inheritance.practice.model.vo;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {
		super();
		
	}

	public Student(String name,int age, double heigth, double weight,int grade, String major) {
		super(name,age,heigth,weight);
		
		this.grade = grade;
		this.major = major;
	}
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(int Grade) {
		this.grade=grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString()+"/"+grade+"/"+major;
	}
	
	
	
	
	

}
