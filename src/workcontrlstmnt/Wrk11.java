package workcontrlstmnt;

import java.util.Scanner;

public class Wrk11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

		 if (num <= 100) {
	            System.out.println("Less than or equal to 100");
	            if (num >= 50) {
	                System.out.println("Greater than or equal to 50");
	            } else {
	                System.out.println("Less than 50");
	            }
	        } else {
	            System.out.println("Greater than 100");
	        }
		 scanner.close();

	}

}
