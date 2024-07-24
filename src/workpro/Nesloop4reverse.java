package workpro;

import java.util.Scanner;

public class Nesloop4reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number=");
		int num=sc.nextInt();
		System.out.println("Reverse of number=");
		int reverse=0;
		while(num!=0) {
			int la=num%10;
			reverse=(reverse*10)+la;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
