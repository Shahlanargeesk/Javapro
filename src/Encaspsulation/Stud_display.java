package Encaspsulation;

public class Stud_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud_details st=new stud_details();
		st.setemail("abc@gamil.com");
		System.out.println(st.getemail());
		
		st.getpass("1234");
		System.out.println(st.getpass());

	}

}
