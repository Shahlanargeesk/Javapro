package workassighned;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input
        Scanner Scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first floating-point number
        System.out.print("Enter the first floating-point number: ");
        float num1 = Scanner.nextFloat();
        
        // Prompt the user to enter the second floating-point number
        System.out.print("Enter the second floating-point number: ");
        float num2 = Scanner.nextFloat();
        
        // Calculate the multiplication of the two numbers
        float result = num1 * num2;
        
        // Print the result
        System.out.println("The result of the multiplication is: " + result);
    }

	}


