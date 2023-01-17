package onlineVideos;

public class ExceptionUser {

	public static void main(String[] args) {
		int i = 8;
		int j = 9;
		try {
			int k = i/j;
			if(k == 0) 
				throw new teluskoException("this is not possible");
			System.out.println(k);	
		}
		catch(teluskoException e) {
			System.out.print("Error " + e.getMessage());
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
		
		

	}

}
