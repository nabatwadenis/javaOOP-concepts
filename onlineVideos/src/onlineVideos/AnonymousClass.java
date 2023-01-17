package onlineVideos;

class S{
	public void show() {
		System.out.println("In A");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		S a = new S(){
			public void show() {
				System.out.println("im the best");
			}
		};
		a.show();

	}

}
