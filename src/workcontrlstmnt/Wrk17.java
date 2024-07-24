package workcontrlstmnt;

import java.util.Scanner;

public class Wrk17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        // Getting three unique integers from the user
	        System.out.print("Enter the first number (a): ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter the second number (b): ");
	        int b = scanner.nextInt();
	        
	        System.out.print("Enter the third number (c): ");
	        int c = scanner.nextInt();

	        // Checking the smallest number using if-else if ladder
	        if (a < b && a < c) {
	            System.out.println("The smallest number is a: " + a);
	        } else if (b < a && b < c) {
	            System.out.println("The smallest number is b: " + b);
	        } else {
	            System.out.println("The smallest number is c: " + c);
	        }

	        scanner.close();
	   

	}

}
