package com.test.stud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	int rollno, marks;
	String name;
	public Stud(int rollno,String name,  int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s) {
		return marks> s.marks ? 1 :-1;
	}
	
	
}

public class ListCon {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(001, "Denis", 70));
		studs.add(new Stud(002, "Ovich", 85));
		studs.add(new Stud(003, "Ondigi", 55));
		studs.add(new Stud(004, "Jusiper",65));
		Collections.sort(studs);
		
		for(Stud s: studs) {
			System.out.println(s);
		}
		

	}

}
