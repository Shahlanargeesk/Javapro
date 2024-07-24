package workpro;

import java.util.Scanner;

public class Reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the digits of the integer
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit
            number /= 10;  // Remove the last digit
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        // Close the scanner
        scanner.close();
    }

	}


