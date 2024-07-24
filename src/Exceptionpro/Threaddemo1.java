package Exceptionpro;

	class Treadnew extends Thread{
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("New Thread");
			}
		}
	}

public class Threaddemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treadnew t=new Treadnew();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		

	}
		
	}

}
