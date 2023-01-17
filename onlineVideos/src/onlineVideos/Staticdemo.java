package onlineVideos;

class Emp{
	int eid;
	int salary;
	static String ceo;
	
	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
}

public class Staticdemo {

	public static void main(String[] args) {
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary =4000;
		Emp.ceo ="rahesh";
		
		Emp rahul = new Emp();
		rahul.eid =5;
		rahul.salary = 3500;
		Emp.ceo = "rahesh";
		Emp.ceo = "Bob";
		
		navin.show();
		rahul.show();
		

	}

}
