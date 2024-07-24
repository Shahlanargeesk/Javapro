package map_pkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Haashmappro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mp=new HashMap<Integer,String>();
		mp.put(1,"Hello");
		mp.put(4,"Good");
		mp.put(6,"GoodMorning");
		
		System.out.println(mp);
		
		System.out.println("Random access="+mp.get(4));
		 Set li=mp.entrySet();
		 Iterator itr=li.iterator();
		 while(itr.hasNext()) {
			 Map.Entry entry=(Map.Entry)itr.next();
			 System.out.println(entry.getKey()+":"+entry.getValue());
			 
			 
		 }


		
		

	}

}
