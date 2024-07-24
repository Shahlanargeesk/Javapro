package oopspro;

public class Usingthiskeyword {
	//student details
	String name;
	String email;
	int id;
	
	//Parameterized constructor
	public Usingthiskeyword(String name,String email,int id) {
//		name=name;
//		email=email;
//		id=id;
//		
		this.name=name;
		this.email=email;
		this.id=id;
		
		
	}
	
	public void print() {
		System.out.println("Name="+name);
		System.out.println("Email="+email);
		System.out.println("Id="+id);


	}
	public static void main(String[] args) {
		Usingthiskeyword obj=new Usingthiskeyword("anu","aaa@gmail.com",111);
		obj.print();
	}

}
