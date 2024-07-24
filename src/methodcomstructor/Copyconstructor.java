package methodcomstructor;

public class Copyconstructor {
	float areaofcircle;
	public Copyconstructor(float pi,int r) {
		// TODO Auto-generated constructor stub
		areaofcircle=pi*r*r;
		
	}
	public void display(){
		System.out.println("Area of circle:"+areaofcircle);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructor ob=new Copyconstructor (3.14f,2);
		ob.display();
		Copyconstructor ob1=ob;
		ob.display();

		

	}

}
