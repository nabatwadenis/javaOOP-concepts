package onlineVideos;


public class tpriority {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() ->{
			for(int i=1; i<=50; i++) {
				System.out.println(i);
				if(i %10 == 0) {
					Thread.yield();
				}
			}
		});
		Thread t2 = new Thread(() ->{
			for(int j=1; j<=5; j++) {
				System.out.println(j);
			}
		});
		t1.setPriority(5);
		t2.setPriority(1);
		t1.start();
		t2.start();

	}

}
