package javaproject;

public class TypecastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening typecasting
		char val='a';
		int sum=val;
		float exp=sum;
		System.out.println("val="+val+"\nnum="+sum+"\next="+exp);
		
		//narrowing typecasting
		float exp1=100.0F;
		int num1=(int)exp1;
		char val1=(char)num1;
		System.out.println("exp1="+exp1+"\nnum1="+num1+"\nval1="+val1);

		
	}

}
