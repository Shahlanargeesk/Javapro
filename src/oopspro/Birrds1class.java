package oopspro;
		class Ducks implements Birrdss{
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("quack...quack");
			}
			
		}

public class Birrds1class implements Birrdss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birrds1class b1=new Birrds1class();
		b1.sound();
		Ducks d=new Ducks();
		d.sound();
		//upcasting
		
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("craaa...craaa");
	}

}
