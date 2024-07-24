package methodcomstructor;

public class Constructorpro {
	String name;
	int age;
	//default constructrs--no parameter 
	public Constructorpro() {
		// TODO Auto-generated constructor stub
		name="Shahla";
		age=27;
		System.out.println("name="+name+"\nage="+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorpro ob=new Constructorpro();
	}

}
