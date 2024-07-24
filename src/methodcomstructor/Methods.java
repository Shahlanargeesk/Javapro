package methodcomstructor;

import java.util.Scanner;

public class Methods {
	//functin with no return type & no parametr
	//Instance method
	public void add() {
		int num1=5;
		float num2=15.00F;
		float sum=num1+num2;
		System.out.println(sum);
	}
	//static method
	public static void sub() {
		int num1=5;
		float num2=15.00F;
		float sub=num1+num2;
		System.out.println(sub);
	
	
    }
	
	
	
			public static void addsc(){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the first number");
				int num1=sc.nextInt();
				System.out.println("Enter the second number");
				int num2=sc.nextInt();
				int sum=num1+num2;
				System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods ob=new Methods();
		ob.add();
		sub();
		addsc();
		
	}

}
