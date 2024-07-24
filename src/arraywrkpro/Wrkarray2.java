package arraywrkpro;

import java.util.Scanner;

public class Wrkarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements in the array: ");
		int size=sc.nextInt();
		
		int []array=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		 // Initialize variables to store min and max values
        int min = array[0];
        int max = array[0];

        // Iterate through the array to find min and max values
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the results
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

	}

}
