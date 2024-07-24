package Control_statement;

public class continue_statmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//continue statement
	//print values till 4 except 2
			for(int i=0;i<5;i++) {
				if(i==2) {
					continue;
		}
			System.out.println(i);
			}
	





//labelcontinue
		
			lb:for(int i=1;i<3;i++) {
				for(int j=1;j<3;j++) {
					if(i==2&&j==2) {
						continue lb ;
					}
				System.out.println(i+" "+j);
			}
			}
			}
			}
			