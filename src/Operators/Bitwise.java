package Operators;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bitwise operetor(& | ^)
		int xx=3,yy=4;
		int res=xx&yy;
		System.out.println("result="+res);
		//Shift operator(<< >> >>>)
		System.out.println(xx<<2);
		System.out.println(xx>>2);
		System.out.println(xx>>>2);
		//Binary
		System.out.println(Integer.toBinaryString(xx>>>2));
		System.out.println(Integer.toBinaryString(5));

		

	}

}
