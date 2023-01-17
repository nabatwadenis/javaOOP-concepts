package onlineVideos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a number");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			System.out.println(n);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			br.close();
		}
		
	}

}
