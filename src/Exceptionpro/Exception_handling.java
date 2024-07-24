package Exceptionpro;
	

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try      {
				
			int num=100;
			int a=num/0;
			System.out.println(a);
			
			int arr[]= {1,2,3,4};
			System.out.println(arr[5]);
			}
			
			catch  (ArrayIndexOutOfBoundsException i)  {
				System.out.println(i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("must execute");
			}
	}
}


