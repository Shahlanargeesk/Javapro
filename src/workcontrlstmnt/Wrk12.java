package workcontrlstmnt;

import java.util.Scanner;

public class Wrk12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        // Getting age and weight from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your weight (in kg): ");
        int weight = scanner.nextInt();

        // Checking eligibility using nested if statements
		age = 18;
		weight = 50;
		
        if  (age >= 18) {
            if  ( weight >= 50) {
            	
                System.out.println("Eligible to donate blood");
                
            }
            else {
                System.out.println("Not eligible to donate blood due to insufficient weight");
            }
            
        }
            
       else {
    	   
       
           System.out.println("Not eligible to donate blood due to age");
       }

       scanner.close();
    
}
}

	


