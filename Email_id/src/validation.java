
	import java.util.ArrayList;
		import java.util.List;
		import java.util.Scanner;

public class validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        // List of email IDs
		        List<String> emailList = new ArrayList<>();
		        emailList.add("aisha@example.com");
		        emailList.add("shaik@example.com");
		        emailList.add("mphasis@example.com");
		        // Add more email IDs as needed

		        // Input from the user
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the email ID to search: ");
		        String searchEmail = scanner.nextLine();

		        // Searching the email ID
		        boolean found = searchEmail(emailList, searchEmail);

		        // Displaying result
		        if (found) {
		            System.out.println("Email ID found!");
		        } else {
		            System.out.println("Email ID not found!");
		        }
		    }

		    // Method to search the email ID in the list
		    public static boolean searchEmail(List<String> emails, String searchEmail) {
		        return emails.stream().anyMatch(email -> email.equals(searchEmail));
		    }
		}

	
