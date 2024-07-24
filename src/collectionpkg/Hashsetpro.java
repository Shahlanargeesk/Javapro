package collectionpkg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hashsetpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set li=new HashSet<String>();
		
		li.add("Hello");
		li.add("12");
		li.add("Welcome");
		li.add("12");
		li.add(null);
		li.add(13);
		
		System.out.println(li);
		

	}

}
