package oopspro;
	
		class Animals{
		String colour;
		public void eat() {
			System.out.println("Animal is eating");
		}
	}
		
		class Dog extends Animals{
			String breed="pug";
			public void bark() {
				System.out.println("Dog is barking");
			}
		}
			public class Inheritanceeg {
		    public static void main(String[] args) {
			// TODO Auto-generated method stub
		    	Dog g=new Dog();
		    	System.out.println("colouf of animal="+(g.colour="white"));
		    	System.out.println("Dog breed ="+g.breed);
		    	g.eat();
		    	g.bark();
		    	
			
	}
	
			}
	


