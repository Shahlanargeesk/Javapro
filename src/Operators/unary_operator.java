package Operators;

public class unary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//unary minus
		int num = 10;  // Original value
        int mi = -num; // Negated value
        System.out.println("unary minus:"+mi);
        
//not operator
        boolean exp=!false;
        System.out.println("not operator:"+exp);
        
//unary increment
//post increment
		int i= 10;  
		i++;
        System.out.println("post increment:"+i);
//pre increment
		++i;
		System.out.println("pre increment:"+i);
		
//unary decrement
//Post Dincrement
		int j=10;
		j--;
		System.out.println("post dincrement:"+j);

//Pre Dincrement
		--j;
		System.out.println("pre dincrement:"+j);

//bitwise
		int k=11;
		int pr=~k;
		System.out.println("Bitwise:"+pr);


           }
}


