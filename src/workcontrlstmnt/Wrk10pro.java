package workcontrlstmnt;

public class Wrk10pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] numbers = {24, 50, 29};
	        int limit = 10;

	        // Using for loop
	        System.out.println("Multiplication table of 24 using for loop:");
	        for (int i = 1; i <= limit; i++) {
	            System.out.println("24 * " + i + " = " + (24 * i));
	        }
	        
	        System.out.println();
	        
	        // Using while loop
	        System.out.println("Multiplication table of 50 using while loop:");
	        int j = 1;
	        while (j <= limit) {
	            System.out.println("50 * " + j + " = " + (50 * j));
	            j++;
	        }
	        
	        System.out.println();
	        
	        // Using do-while loop
	        System.out.println("Multiplication table of 29 using do-while loop:");
	        int k = 1;
	        do {
	            System.out.println("29 * " + k + " = " + (29 * k));
	            k++;
	        } while (k <= limit);
	    }

	}


