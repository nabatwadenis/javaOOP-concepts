package com.test;

abstract class Employee{
	int tscno = 345;
	String name = "Donald";
	int Salary = 35000;
}
class Register extends StudentInfo{
	public void check() {
		info();
		
	}
}
public class Teachers {

	public static void main(String[] args) {
		Register e = new Register();
		e.check();
	}

}
