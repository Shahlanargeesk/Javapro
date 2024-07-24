package Exceptionpro;

import java.util.Scanner;

public class Exception_handiling1 {
		public void details() {
			Scanner scan=new Scanner (System.in);
			try {
				System.out.println("Enter an integer");
				int no=scan.nextInt();
				System.out.println("number="+no);
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("please enter a valid input");
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception_handiling1 ob=new Exception_handiling1();
			ob.details();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
