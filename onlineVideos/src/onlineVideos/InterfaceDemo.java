package onlineVideos;


interface Write{
	void show();
	
}
class ABC implements Write {
	public void show() {
		System.out.println("this is written text");
	}
}
class CDE extends ABC implements Write{
	public void properties(){
		System.out.println("a new addition of implementation");
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Write w = new ABC();
		CDE y = new CDE();
		y.show();
		y.properties();
		w.show();

	}

}
