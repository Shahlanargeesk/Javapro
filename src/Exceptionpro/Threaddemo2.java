package Exceptionpro;

public class Threaddemo2 implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Threaddemo2 ob=new Threaddemo2();
		Thread t=new Thread(ob);
		t.start();
		t.sleep(5000);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current working Thread is="+Thread.currentThread().getName());
	}

}
