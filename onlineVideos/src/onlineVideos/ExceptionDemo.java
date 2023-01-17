package onlineVideos;

public class ExceptionDemo {

	public static void main(String[] args) {
		try{
			int a[] = new int[6];
			a[6] = 8;
			int i = 50;
			int j = 0;
			int k = i/j;
			System.out.println("The output is "+ k);
		}
		catch(ArithmeticException e) {
			System.out.println("Probable math error!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("beyond array limit");
		}
		catch(Exception e) {
			System.out.println("something wrong!");
		}
		finally {
			System.out.println("Bye");
		}
		
		

	}

}
