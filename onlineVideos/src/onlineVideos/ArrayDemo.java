package onlineVideos;



public class ArrayDemo {

	public static void main(String[] args) {
		int d[][] = {
				{1,2,3,4},
				{2,4,6,},
				{5,6,7,8,9}
		};
		for(int j[]: d) {
			for(int l: j) {
				System.out.print("" + l);
			}
			System.out.println();
		}
		int a[] = {1,2,3,4};
		for(int k: a) {
			System.out.println(k); //enhanced for loop
		}
		
		

	}

}
