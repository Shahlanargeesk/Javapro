package workpro;

public class Arithmetic_operator {



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		 // Define variables for the expressions
        int A = 10; // Example value for A
        int b = 3;  // Example value for b
        int num1 = 100; // Example value for num1
        int c = 5;  // Example value for c
        int x = 5;  // Example value for x
        int y = 2;  // Example value for y
        int z = 10; // Example value for z
	
       //  1. A % b
        int result1 = A % b;
        System.out.println("1. A % b = " + result1);
        
      //   2. num1 / c
        int result2 = num1 / c;
        System.out.println("2. num / c = " + result2);
        	
        

     //    3. 4 / 2 + 8 * 4 - (5 + 2) % 3;
        int result3 = 4 / 2 + 8 * 4 - (5 + 2) % 3;
        System.out.println("3. 4 / 2 + 8 * 4 - (5 + 2) % 3 = " + result3);
        	
        

       // 4. x + z / x + (z % y) * (z - x);
        int result4 = x + z / x + (z % y) * (z - x);
        System.out.println("4. x + z / x + (z % y) * (z - x) = " + result4);
        	
        

      //   5. z / x + y * x - (y + x) % z;
       int result5 = z / x + y * x - (y + x) % z;
        System.out.println("5. z / x + y * x - (y + x) % z = "+ result5);
        
        
        
	}    
	
					
	
        
	}
    







