package workcontrlstmnt;

import java.util.Scanner;

public class Wrk2pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the year: ");
	        int year = scanner.nextInt();

	        boolean isLeap = false;

	        if (year % 4 == 0) {
	            if (year % 100 != 0 || year % 400 == 0) {
	                isLeap = true;
	            }
	        }

	        if (isLeap) {
	            System.out.println(year + " is a leap year");
	        } else {
	            System.out.println(year + " is not a leap year");
	        }

	        scanner.close();

	}

}
