package collectionpkg;

import java.util.PriorityQueue;

public class Priorityqueuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <String> li=new PriorityQueue <> ();
		li.add("hello");
		li.add("good");
		li.add("abc");
		li.add("welcome");
		
		for(String data:li) {
			System.out.println(data);
		}

	}

}
