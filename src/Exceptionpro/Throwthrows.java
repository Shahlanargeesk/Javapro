package Exceptionpro;

import java.util.Scanner;

//create a user defined exception
			class Agelimitexception extends RuntimeException{
				public Agelimitexception(String msg) {
					super (msg);
				}
			}

public class Throwthrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter your age= ");
			int age=sc.nextInt();
			
			if (age<18){
				throw new Agelimitexception("Below 18 is not eligible");
				
			}
			else {
				System.out.println("Eligible for votting");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Helloo");

	
	}

}