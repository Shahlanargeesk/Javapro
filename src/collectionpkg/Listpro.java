package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.*;

public class Listpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li=new ArrayList();
		li.add("Anu");
		li.add(25);
		li.add("java");
		li.add(50);
		System.out.println("Display li="+li);
		
		li.add("Manu");
		System.out.println("Accessing all list data=");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("Random access="+li.get(3));
		List li1=new ArrayList();
		li1.addAll(li);
		System.out.println("Display li1 elements="+li1);
		
		li.remove(2);
		System.out.println("Elements="+li);
		System.out.println("li1="+li1);
		
		li1.clear();
		System.out.println(li1);
		
		Iterator itr=li.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
	}

}
