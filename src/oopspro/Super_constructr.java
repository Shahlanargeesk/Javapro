package oopspro;
				class vehicle{
				public vehicle() {
				// TODO Auto-generated constructor stub
						System.out.println("max speed=120");
					}
				public vehicle(int maxspeed) {
					System.out.println("max speed="+maxspeed);
					
				}
}
				class car extends vehicle{
				public car() {
					super(40);
					System.out.println("max speed=200");
				}
				}

public class Super_constructr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
