package onlineVideos;

class Student{
	private int rollno;
	private String name;
	
	//Getters and Setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("value of rollno changed");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Jenkins");
		System.out.println(s1.getRollno());
		

	}

}
