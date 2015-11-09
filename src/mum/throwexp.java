package mum;

import java.security.spec.ECFieldF2m;

public class throwexp {

	public static void method(int x) throws Exception{
		if(x<10)
			throw new ArithmeticException("is handled");
		
		else
			System.out.println("this is shahed");
		
	}
	
	public static void main(String[] args) {
		
		try {
			method(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("hi");

	}

}
