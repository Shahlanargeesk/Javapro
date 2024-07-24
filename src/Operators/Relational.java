package Operators;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=100;
		boolean greater=num1>num2;
		boolean greaterequal=num1>=num2;
		boolean less=num1<num2;
		boolean lessequal=num1<=num2;
		boolean equal=num1==num2;
		boolean notequal=num1!=num2;
		
		System.out.println("greaterthan:"+greater+"\nGreaterThanEqual:"+greaterequal);
		System.out.println("lessthan:"+less+"\nlessThanEqual:"+lessequal);
		System.out.println("equal:"+equal+"\nNotEqual:"+notequal);

	}
}