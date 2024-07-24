package Exceptionpro;

public class Threadpro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current Thread is="+t);
		System.out.println("Thread name is="+t.getName());
		
		//change name of the Thread
		t.setName("My Thread");
		System.out.println("After changing name is="+t);
		System.out.println("New Thread name is="+t.getName());
		
		try {
			for(int n=5;n>=1;n--) {
				System.out.println(n);
				Thread.sleep(5000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
