package workcontrlstmnt;

import java.util.Scanner;

public class Wrk6pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Get the three numbers from the user
	        System.out.print("Input the 1st number: ");
	        int firstNumber = scanner.nextInt();
	        
	        System.out.print("Input the 2nd number: ");
	        int secondNumber = scanner.nextInt();
	        
	        System.out.print("Input the 3rd number: ");
	        int thirdNumber = scanner.nextInt();
	        
	        // Determine the greatest number
	        int greatest = firstNumber;
	        
	        if (secondNumber > greatest) {
	            greatest = secondNumber;
	        }
	        
	        if (thirdNumber > greatest) {
	            greatest = thirdNumber;
	        }
	        
	        // Print the greatest number
	        System.out.println("The greatest: " + greatest);
	        
	        // Close the scanner
	        scanner.close();

	}

}
