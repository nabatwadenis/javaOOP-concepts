package practice;

public class Tester {

	public static void main(String[] args) {
		int [] index = new int[4];
		index[0] = 1;
		index[1] = 2;
		index[2] = 3;
		index[3] = 0;
		
		String [] islands = new String[4];
		islands[0] = "fiji";
		islands[1] ="malibu";
		islands[2] =" hawaii";
		islands[3] = "kilifi";
		
		int y =0;
		int ref;
		while (y<4) {
			ref = index[y];
			System.out.print("The island is:");
			System.out.println(islands[ref]);
			y = y+1;
		}
				
		
		
	}

}
