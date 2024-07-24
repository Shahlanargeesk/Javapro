package Control_statement;

public class Break_label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//till 2 2
		outer:for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
				if(i==2&&j==2) {
						break outer;
				}
			}
		}
	}

}
