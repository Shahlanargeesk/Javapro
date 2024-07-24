package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> li=new LinkedList<String>();
		List lii=new ArrayList();
		li.add("Anu");
		li.add("25");
		li.add("java");
		li.add("50");
		System.out.println("Display li="+li);
		
		li.add("Manu");
		li.add("21");
		System.out.println("Accessing all list data=");
		
		for(String data:li) {
			System.out.println(data);
		}
}
}