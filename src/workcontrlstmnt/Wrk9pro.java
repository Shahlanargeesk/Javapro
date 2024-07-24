package workcontrlstmnt;

public class Wrk9pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Armstrong numbers between 1 and 500:");

	        for (int number = 1; number <= 500; number++) {
	            int sum = 0;
	            int temp = number;
	            while (temp != 0) {
	                int digit = temp % 10;
	                sum += digit * digit * digit;
	                temp /= 10;
	            }
	            if (sum == number) {
	                System.out.println(number);
	            }
	        }

	}

}
