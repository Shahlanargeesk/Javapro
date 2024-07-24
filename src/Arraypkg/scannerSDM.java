package Arraypkg;

import java.util.Scanner;

public class scannerSDM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		//size
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int arra[]=new int [size];
		
		System.out.println("enter the elements:");
		for(i=0;i<size;i++);{
			arra[i]=sc.nextInt();
//display
			
		}
		System.out.println("new array is:");
		for(i=0;i<size;i++);{
			System.out.println(arra[i]);
		}
		
		
		
	}

}
