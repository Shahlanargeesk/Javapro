package oopspro;

			class Birds{
			public void sound() {
			System.out.println("keee....keee");	
			}
			}
			class Crow extends Birds{
			public void sound() {
			System.out.println("kraa....kraaa");	
					
			}
		}

			public class Overridingpoly {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crow crow=new Crow();
		crow.sound();

	}
			}

