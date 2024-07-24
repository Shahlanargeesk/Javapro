package map_pkg;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkeedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer,String> mp=new LinkedHashMap <Integer, String> ();
		mp.put(1,"Hello");
		mp.put(4,"Good");
		mp.put(6,"GoodMorning");
		mp.put(2,"anu");

		
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
