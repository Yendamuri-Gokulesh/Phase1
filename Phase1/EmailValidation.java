package Phase1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

	//Email validation

	public static void main(String[] args) {

			ArrayList<String> emailArray = new ArrayList<String>();

			emailArray.add("256885@.com");
			emailArray.add("256373@.com");
			emailArray.add("256986@.com");
			emailArray.add("258697@.com");
			emailArray.add("251232@.com");
			emailArray.add("259809@.com");
			emailArray.add("258980@.com");
			emailArray.add("259790@.com");
			emailArray.add("250808@.com");


			Scanner sc = new Scanner(System.in);

			System.out.print("Enter an email ID to search: ");

			String searchEmail = sc.nextLine();

			boolean value = searchEmailID(emailArray, searchEmail);

			if (value) {

				System.out.println("Email ID found!");

			} else {

				System.out.println("Email ID not found.");
			}
	}

		public static boolean searchEmailID(ArrayList<String> emailArray, String searchEmail) {

			for (String email : emailArray) {

				if (email.equals(searchEmail)) {

					return true;
				}
			}
			return false;
		}
}

