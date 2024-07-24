package oopspro;
		abstract class vehicles{
			public abstract void start();
			
			public static void speed() {
				System.out.println("max speed=120");
			}
				
			}
		class Bikee extends vehicles{
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("key start");
				
			}
		}
		class Train extends vehicles{
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("button press start");
			}
		}
		
public class Data_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikee b=new Bikee();
	   b.start();
	   Train t=new Train();
	   t.start();

	}

}
