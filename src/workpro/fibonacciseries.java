package workpro;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the number of terms
	        System.out.print("Enter the number of terms for the Fibonacci series: ");
	        int n = scanner.nextInt();

	        // Print the Fibonacci series
	        System.out.print("Fibonacci series of " + n + " terms: ");
	        int a = 0, b = 1;

	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            int nextTerm = a + b;
	            a = b;
	            b = nextTerm;
	        }

	        // Close the scanner
	        scanner.close();
	    }
	
	}


