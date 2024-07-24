package Stringpro;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//length
		String name="Shaanu";
		System.out.println(name.length());

		//char
		String s1="anasmelepediakkal";
		char c=s1.charAt(5);
		System.out.println(c);
		
		//compareto
		String n1="anasmelepediakkal";
		String n2="nezamelepediakkal";
		System.out.println(n1.compareTo(n2));
		
		//concat
		String a1="anasmelepediakkal";
		String a2="shahlamelepediakkal";
		System.out.println(a1.concat(a2));
		
		//contains
		String j="java is simple";
		System.out.println(j.contains("is"));
		System.out.println(j.contains("was"));

		//equals
		String n3="Shaanu";
		String n4="SHANU";
		String n5="nargees";
		System.out.println(n3.equals(n4));
		System.out.println(n3.equalsIgnoreCase(n5));
		
		//lower & upper case
		String n6="Shaanu";
		String n7="SHAANU";
		System.out.println(n6.toUpperCase());
		System.out.println(n7.toLowerCase());
		
		//getbytes
		String h="ABCDEFGH";
		byte b[]=h.getBytes();
		for(int i=0;i<0;i++) {
			
		}
		
		


		

		


		
	}

}
