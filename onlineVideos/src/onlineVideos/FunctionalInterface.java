package onlineVideos;

interface Demo{
	void abc();
	default void show() {
		System.out.println("this is demo");
	}
}
interface MyDemo{
	default void show() {
		System.out.println("this is mydemo");
	}
}
interface sintfrc{
	static void find() {
		System.out.println("This is static method in interface");
	}
}
class DemoImp implements Demo,MyDemo{
	public void abc(){
		System.out.println("this is int");	
	}
	@Override
	public void show() {
		Demo.super.show();
	}
	
}

public class FunctionalInterface {
	public static void main(String[] args) {
		Demo obj = new DemoImp();
		obj.show();
		obj.abc();
		sintfrc.find(); //this is the calling of static method in interface

	}
}
	

	

