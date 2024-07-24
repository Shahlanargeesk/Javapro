package workcontrlstmnt;

import java.util.Scanner;

public class Wrk3pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        // Get the first integer from the user
        System.out.print("Input first integer: ");
        int firstNumber = scanner.nextInt();
        
        // Get the second integer from the user
        System.out.print("Input second integer: ");
        int secondNumber = scanner.nextInt();
        
        // Compare the numbers and print the results
        if (firstNumber != secondNumber) {
            System.out.println(firstNumber + " != " + secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " < " + secondNumber);
        }
        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + " <= " + secondNumber);
        }
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " == " + secondNumber);
        }
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        }
        if (firstNumber >= secondNumber) {
            System.out.println(firstNumber + " >= " + secondNumber);
        }
        
        // Close the scanner
        scanner.close();

	}

}
