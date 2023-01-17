package onlineVideos;

class Calculator{
	public int add(int ...n ) {
		int sum = 0;
		for (int i: n) {
			sum = sum + i;
		}
		return sum;
	}
}

public class Varargs {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.print(obj.add(5, 7, 3));
		
	}

}
