package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Sales{
	public void discount() {
		double price = 0.0;
		System.out.println("Enter the cost");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double n = Double.parseDouble(br.readLine());
			double discount = 0.05 *n;
			price = n - discount;
			
			
		}
		catch(Exception e){
			System.out.println("Math error");	
		}
		System.out.println(price);
		
	}
}

class Arrprint{
	public void show() {
		String Student[] = {"Otieno", "Ann", "Job", "James"};
		for(String k: Student) {
			System.out.println(" " + k);
		}
	}
}

class Square{
	int Area = 0;
	int side = 4;
	int result = 0;
	public void perimeter() {
		result = side * 4;
		System.out.println(result);
	}
	public void Area() {
		result = side *side;
		System.out.println(result);
		
	}
}


public class Exam {

	public static void main(String[] args) {
		Sales s = new Sales();
		Arrprint ar = new Arrprint();
		Square sq = new Square();
		//s.discount();
		ar.show();
		sq.Area();
		
		

	}

}
