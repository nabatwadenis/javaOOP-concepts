package onlineVideos;

class Casio{
	public void add(int i, int j) {
		System.out.print(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.print(i+j +k);
	}
	public void add(double i, double j) {
		System.out.print(i+j);
	}
}

public class MethodOverload {
	public static void main(String[] args) {
		Casio obj = new Casio();
		obj.add(4.6, 5.7);
		
	}

}
