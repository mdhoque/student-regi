package mum;

public class Fibrecursive {

	public static int fib(int count){
		
		if(count<=1 )
			return 1;
		
	
	return fib(count-1)+fib(count-2);
	}
	
	public static void main(String[] args) {
		
		int count =6;
           		 
			 System.out.println("0 1");
		 
		  System.out.println(" " + fib(count-2));
	}
	}