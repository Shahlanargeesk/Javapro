package Operators;

public class Logic {
//work1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=30;
		boolean var=num1>num2;//false
		boolean var1=num1<num2;//true
		//Logic AND
		System.out.println("Logic And="+(var&&var1));
		//Logic OR
		System.out.println("Logic OR="+(var||var1));
		//Logic NOR
		System.out.println("Logic NOT="+(!var1));


	}

}
