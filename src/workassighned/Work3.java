package workassighned;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Scanner object to read input
       int a=20,b=30,temp;
       temp=b;
       b=a;
       System.out.println("a="+a+"\nb="+b);
       
       //swapping without a temporary variable
       int x=20,y=30;
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("x="+x+"\ny="+y);
       

}
}