package Control_statement;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
