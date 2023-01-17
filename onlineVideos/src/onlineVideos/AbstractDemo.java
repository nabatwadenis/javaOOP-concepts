package onlineVideos;

abstract class Human{
	public abstract void eat(); 
	public void walk() {
		System.out.print("humans walk");
		
	}
}

class Man extends Human{ //concrete class
	public void eat() {
		System.out.print("humans eat");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		 Human obj = new Man();

	}

}
