package arraywrkpro;

import java.util.Scanner;

public class Wrkarray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no.of elements in the array: ");
		 int size=sc.nextInt();
		 
		 int[]arr=new int[size];
		 System.out.println("Enter the elements of the array: ");
		 for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
		 }
		 //calculate the sum of the array elements
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 sum=arr[i];
		 }
		 double average=(double) sum/arr.length;
		 double roundedvalue=Math.round(average*100.0)/100.0;
		 System.out.println("The average value of the array element is: "+roundedvalue);
		 
	}

}
