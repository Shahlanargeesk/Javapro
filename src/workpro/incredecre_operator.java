package workpro;

public class incredecre_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Postfix Increment (A++):
		int A = 20;
		int B = A++; // B gets the value of A (20), then A is incremented to 21
		System.out.println("A:"+A);

		//Prefix Increment (++A):
		 A = 20;
		 B = ++A; // A is incremented to 21, then B gets the value of A (21)
			System.out.println("A:"+A);

		 //Postfix Decrement (A--):
		 A = 20;
		 B= A--; // B gets the value of A (20), then A is decremented to 19
			System.out.println("A:"+A);

		//Prefix Decrement (--A):
		 A= 20;
		B= --A; // A is decremented to 19, then B gets the value of A (19)
		System.out.println("A:"+A);

	}

}
