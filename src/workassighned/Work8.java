package workassighned;

import java.util.Scanner;

public class Work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        String result = (number % 2 == 0) ? "Even" : "Odd";
	        System.out.println("The number " + number + " is " + result + ".");
	}

}
