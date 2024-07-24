package workcontrlstmnt;

import java.util.Scanner;

public class Wrk5pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Get the number from the user
	        System.out.print("Input a number: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is even or odd
	        if (number % 2 == 0) {
	            System.out.println(1); // Number is even
	        } else {
	            System.out.println(0); // Number is odd
	        }
	        
	        // Close the scanner
	        scanner.close();

	}

}
