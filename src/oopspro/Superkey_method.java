package oopspro;

	class Birds1{
	public void sound() {
	System.out.println("keee....keee");	
	}
	}
	      class Crow1 extends Birds1{
	      public void sound() {
		  super.sound();
	System.out.println("kraa....kraaa");	
	}
	}

public class Superkey_method {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crow1 c=new Crow1();
		c.sound();


	}

}
