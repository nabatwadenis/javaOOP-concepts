package onlineVideos;

abstract class Writer{
	public void show() {
		System.out.println("is used to scribble words on paper");	
	}
	
}
class Pen extends Writer{
	public void attribute() {
		System.out.println("ink based writing tool, may be sharp tip or ballpoint");
	}
}
class pencil extends Writer{
	public void attribute() {
		System.out.println("graphite based erasble writing tool");
	}
}


public class AbstractAssign {

	public static void main(String[] args) {
		Writer p = new Pen();
		p.show();

	}

}
