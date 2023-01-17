package onlineVideos;

class Clock extends Thread{
	java.text.DateFormat f = java.text.DateFormat.getTimeInstance(java.text.DateFormat.MEDIUM);
	volatile boolean keepRunning = false;
	public Clock() {
		setDaemon(true);
		start();
	}
	public void run() {
		while(keepRunning == true) {
			String time = f.format(new java.util.Date());
			System.out.println(time);
			try {Thread.sleep(10000);}catch (InterruptedException e) {}	
		}
	}
	public void pleaseStop() {
		keepRunning =false;
	}
}

public class tcon{
	
	public static void main(String[] args) {
		Clock c = new Clock();
		c.pleaseStop();

	}

}
