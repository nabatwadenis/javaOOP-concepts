package onlineVideos;

class X{
	public void show() {
		System.out.println("in A");
	}
}
class Y extends X{
	public void show() {
		super.show();
		System.out.println("in B");
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		Y obj1 = new Y();
		obj1.show();
		

	}

}
