package workcontrlstmnt;

public class Wrk7pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Print the first pattern
        System.out.println("First pattern:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        // Print the second pattern
        System.out.println("Second pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        // Print the third pattern
        System.out.println("Third pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        // Print the fourth pattern
        System.out.println("Fourth pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (i == 1 ? 1 : (i % 2 == 0 ? 2 : 3)); j++) {
                System.out.print("*");
            }
            System.out.println();

	}

}
}
