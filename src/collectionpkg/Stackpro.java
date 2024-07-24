package collectionpkg;

import java.util.Stack;

public class Stackpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack li=new Stack();
		li.push("Ammu");
		li.push(20);
		li.push("achu");
		li.push(25);
		
		System.out.println("Display elements="+li);
		
		li.push("Dilu");
		li.push(26);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(" Elements are="+li.get(i));
		}
		
		
		System.out.println("\n Top element is="+li.peek());
		li.pop();
		System.out.println(li);
		System.out.println("Top element is="+li.peek());


	}

}
