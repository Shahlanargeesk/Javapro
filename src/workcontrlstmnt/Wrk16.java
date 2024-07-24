package workcontrlstmnt;

import java.util.Scanner;

public class Wrk16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Getting the number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Checking the number using if-else if ladder
	        if (number > 100) {
	            System.out.println("The number is greater than 100");
	        } else if (number < 100) {
	            System.out.println("The number is less than 100");
	        } else {
	            System.out.println("The number is equal to 100");
	        }

	        scanner.close();

	}

}
