package Control_statement;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Chrome";
		switch(browser) {
		case "Safari":System.out.println("Safari browser");
		break;
		case "Chrome":System.out.println("Chrome browser");
		break;
		case "Edge":System.out.println("Edge browser");
		break;
		default:System.out.println("not suppoerted browser");
		
		}
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day:");
		int day=scan.nextInt();
		
		switch (day) {
		case 1:System.out.println("mon");
		break;
		case 2:System.out.println("Tue");
		break;
		case 3:System.out.println("wed");
		break;
		case 4:System.out.println("Thu");
		break;
		case 5:System.out.println("Fri");
		break;
		case 6:System.out.println("Sat");
		break;
		case 7:System.out.println("Sun");
		break;
		
		default:System.out.println("not a day");
		
		}
		
		System.out.println("1.PG \n a.MTec \n b.MCA \n c.MBA");
		System.out.println("1.UG \n a.BTec \n b.BCA \n c.BBA");
		
		int grad=2;
		char curs='a';
		
		switch(grad) {
		
		case 1:System.out.println("PG");
		
		switch(curs) {
		case'a':System.out.println("MTec");
		break;
		case'b':System.out.println("MCA");
		break;
		case'c':System.out.println("MBA");
		break;
		default:System.out.println("invalid input");
	break;
		case 2:System.out.println("UG");
		
		switch(curs) {
		case'a':System.out.println("BTec");
		break;
		case'b':System.out.println("BCA");
		break;
		case'c':System.out.println("BBA");
		break;
		default:System.out.println("invalid input");
	break;
		}
		}
		}

	}

}
