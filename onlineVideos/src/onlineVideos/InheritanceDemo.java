package onlineVideos;

class Calc2{
	public int add(int ...n) {
		int sum = 0;
		for(int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

class CalcAdv extends Calc2{
	
	public int sub(int i , int j) {
		return i - j;
	}
	
}
class CalcvryAd extends CalcAdv{
	public int mult(int i , int j) {
		return i * j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		CalcvryAd obj2 = new CalcvryAd();
		int results = obj2.sub(10,7);
		int results2 = obj2.add(5,7);
		int results3 = obj2.mult(5, 5);
		System.out.println(results2);
		System.out.print(results3);

	}

}
