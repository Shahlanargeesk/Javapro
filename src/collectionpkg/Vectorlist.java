package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Vectorlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> li=new Vector<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println("Display li="+li);
		
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	
		}

		

	}

}
