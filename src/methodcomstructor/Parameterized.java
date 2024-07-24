package methodcomstructor;

public class Parameterized {
	
	float areaofcircle;
	
	public Parameterized(float pi,int r) {
		// TODO Auto-generated constructor stub
		areaofcircle=pi*r*r;
		System.out.println("Area of circle:"+areaofcircle);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized ob=new Parameterized(3.14f,2);
		

	}

}
