package practice;

class Worker{
	private int id;
	private String name;
	private String position;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}

public class Pracabstract {

	public static void main(String[] args) {
		Worker w = new Worker();
		w.setId(002);
		w.setName("David Habour");
		w.setPosition("Manager");
		System.out.println(w.getName());
		

	}

}
