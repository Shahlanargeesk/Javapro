package oopspro;

		class vehicle{
			int maxspeed=120;
		}
		//super keywrd with instance variable
		class car extends vehicle{
			int maxspeed=200;
			public void display() {
				System.out.println(super.maxspeed);
				System.out.println("maxspeed of car="+maxspeed);
			}
		}

public class Superkeywrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		c.display();

	}

}
