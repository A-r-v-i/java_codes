import java.util.regex.*;
import java.util.Scanner;

public class testregex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		String number=input.next();
		String regexp = "\\d{10}";
		
		Pattern patt = Pattern.compile(regexp);
		Matcher match = patt.matcher(number);
		if(match.matches())
		{
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}
			
	}

}
