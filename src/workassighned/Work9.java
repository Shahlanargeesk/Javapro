package workassighned;

import java.util.Scanner;

public class Work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        int p = scan.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int q = scan.nextInt();
	        
	        System.out.print("Enter the third number: ");
	        int r = scan.nextInt();
	        
	        boolean result = (p + q == r) || (q + r == p) || (r + p == q);
	        System.out.println("The result is: " + result);
	}

}
