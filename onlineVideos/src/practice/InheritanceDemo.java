package practice;

class Bicycle{
	protected int gear;
	protected int speed;
	
	public Bicycle(int startspeed, int startgear) {
		gear = startgear;
		speed = startspeed;
	}
	public void setgear(int newValue) {
		gear = newValue;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedup(int increment) {
		speed += increment;
	}
}

class MountainBike extends Bicycle{
	public int seatheight;
	
	public MountainBike(int startheight, int startspeed, int startgear) {
		super(startspeed, startgear);
		this.seatheight = startheight;
	}
	public void setheight(int newValue){
		seatheight = newValue;	
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		MountainBike mn = new MountainBike(20, 10, 1);
		System.out.println("the initial gear is: "+mn.gear);
		System.out.println("the speed of the bike is: " + mn.speed);
		System.out.println("the height of the bike is: " + mn.seatheight);
		mn.applyBrake(5);
		System.out.println("the speed of the bike is: " + mn.speed);
		mn.setgear(3);
		System.out.println("the new gear is " + mn.gear);
		

	}

}
