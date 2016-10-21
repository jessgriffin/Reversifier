import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversifier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
		
		String userInput;
		
		System.out.println("Enter a string to be reversified: ");
		userInput = br.readLine();
	    
		String reversed = Reverse(userInput);
		
		System.out.println(reversed);
		
	}
	
	public static String Reverse(String userInput) {
		
		String subString = "";
		String character = "";
		String reversed = "";
		int lengthOfString = userInput.length();
		
		if (userInput.length() > 0) {
			
			subString = userInput.substring(1, lengthOfString);
			System.out.println(subString);
			character = userInput.substring(0, 1);
			System.out.println(character);
			System.out.println(" ");
			
			Reverse(subString);
			
			//add last character to the string
			System.out.print(character);
		}
		
		return reversed; 
		
	}
	

}
