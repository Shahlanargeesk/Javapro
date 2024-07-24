package workcontrlstmnt;

import java.util.Scanner;

public class Wrk4pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Get the four integers from the user
	        System.out.print("Enter first number: ");
	        int firstNumber = scanner.nextInt();
	        
	        System.out.print("Enter second number: ");
	        int secondNumber = scanner.nextInt();
	        
	        System.out.print("Enter third number: ");
	        int thirdNumber = scanner.nextInt();
	        
	        System.out.print("Enter fourth number: ");
	        int fourthNumber = scanner.nextInt();
	        
	        // Compare the numbers
	        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber) {
	            System.out.println("Numbers are equal!");
	        } else {
	            System.out.println("Numbers are not equal!");
	        }
	        
	        // Close the scanner
	        scanner.close();

	}

}
