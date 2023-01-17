package com.test;

abstract class StudentInfo{
	String Name = "Bob";
	Integer Age = 17;
	public void info(){
		String name = "Phil";
		int age = 15;
		int regno = 001;
		String Year = "one";
		System.out.println("Student name is "+name);
		
	}
}
class Exams extends StudentInfo{
	public void marks() {
		String programming = "A";
		String mathematics = "B";
		String business = "B";
		System.out.println("programming marks is " +programming);
		System.out.println("mathematics marks is " +mathematics);
		System.out.println("business marks is " +business);
		
	}
}

public class Students {

	public static void main(String[] args) {
		StudentInfo s = new Exams();
		Exams e = new Exams();
		s.info();
		e.marks();
		
		

	}

}
