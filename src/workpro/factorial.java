package workpro;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter a number
		        System.out.print("Enter a number to find its factorial: ");
		        int number = scanner.nextInt();

		        // Calculate the factorial
		        long factorial = 1;
		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }

		        // Print the result
		        System.out.println("The factorial of " + number + " is " + factorial);
		        
		        // Close the scanner
		        scanner.close();
		    }
		
	}


