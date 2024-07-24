package collectionpkg;

import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque <String> li= new ArrayDeque <String> ();
		li.add("hello");
		li.add("good");
		li.add("abc");
		li.add("welcome");
		
		for(String data:li) {
			System.out.println(data);

	}
		li.addFirst("Java");
		li.addLast("programming");
		System.out.println(li);
		
		li.poll();
		System.out.println(li);
		
		li.pollFirst();
		System.out.println(li);
		
		li.pollLast();
		System.out.println(li);
		
		li.peek();
		System.out.println(li);

}
}