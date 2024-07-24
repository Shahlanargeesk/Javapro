package workcontrlstmnt;

import java.util.Scanner;

public class Wrk14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Getting the marks from the user
	        System.out.print("Enter your marks: ");
	        int marks = scanner.nextInt();

	        // Determining the grade using if-else if ladder
	        if (marks > 90) {
	            System.out.println("Grade: A");
	        } else if (marks >= 70 && marks <= 89) {
	            System.out.println("Grade: B");
	        } else if (marks >= 50 && marks <= 69) {
	            System.out.println("Grade: C");
	        } else if (marks < 50) {
	            System.out.println("Grade: D");
	        }

	        scanner.close();
	    }
	

	}


