package arraywrkpro;

import java.util.Arrays;

public class Wrkarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5};
	        
	        System.out.println("Original array: " + Arrays.toString(arr));
	        
	        reverseArray(arr);
	        
	        System.out.println("Reversed array: " + Arrays.toString(arr));
	    }
	    
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        
	        while (start < end) {
	      // Swap elements at start and end indices
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            
	            // Move towards the center
	            start++;
	            end--;
	        }

	}

}
