package oopspro;

public class Methodoverlodg {
	public void add() {
		int a,b,c;
		a=5;
		b=10;
		c=a+b;
		System.out.println("sum="+c);
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,float b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverlodg obj=new Methodoverlodg();
		obj.add(5, 10,15);
		
	}

}
