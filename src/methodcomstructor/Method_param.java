package methodcomstructor;

public class Method_param {
	
		public void add(int num1,float num2) {
		float sum=num1+num2;
		System.out.println("sum:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_param ob=new Method_param();
		ob.add(1,5.5f);
	}

}
