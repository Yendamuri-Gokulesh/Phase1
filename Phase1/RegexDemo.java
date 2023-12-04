package Phase1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an email ID to search: ");
		String email = sc.nextLine();
		
		
		String emailRegex = "^[a-zA-Z0-9_.-]+@(.+)$";
		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher emailMatcher = emailPattern.matcher(email);
		
		if(emailMatcher.matches())
		System.out.println("\n The given text is a valid email");
		else System.out.println("\n The given text is NOT a valid email");
				
				
	}

}