package onlineVideos;

class Outer{
	int v ;
	public void show() {
		v = 10;
		System.out.println(v);
	}
	class Inner{
		public void display() {
			System.out.println("in display");
		}
	}
}

public class InnerDemo {
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show(); 
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}

}
