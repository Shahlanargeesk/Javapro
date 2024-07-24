package workcontrlstmnt;

public class Wrk8pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Define the array
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        // Calculate the sum of the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = sum / (double) numbers.length;
        System.out.println("The average of the said array is: " + average);

        // Find and print the numbers greater than the average
        System.out.println("The numbers in the said array that are greater than the average are:");
        for (int number : numbers) {
            if (number > average) {
                System.out.println(number);
            }
        }

	}

}
