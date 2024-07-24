intpackage Operators;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=100,sum,sub,mul,mod;
		float div;
		
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		mod=num1%num2;
		div=num1/num2;
		
		System.out.println("sum:"+sum);
		System.out.println("sub:"+sub);
		System.out.println("mul:"+mul);
		System.out.println("mod:"+mod);
		System.out.println("div:"+div);
		
		
		int abc=2+3-(4*5)%8/4;
		System.out.println("\nvalue:"+abc);
		int ab=4/2+8*4-(5+2)%3;
		System.out.println("\nvalue2:"+ab);
		
		
		

	}

}
