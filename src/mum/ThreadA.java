package mum;



public class ThreadA {

	public static void main(String[] args) {
	
		ThreadB bb = new ThreadB();
		Thread b = new Thread(bb);
		b.start();
		
		synchronized (b) {
				
		try{
			
			System.out.println("wait for b to complete");
		b.wait();
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		System.out.println("total is: "+bb.total);
		}
		
		
 // System.out.println("Total is "+ b.toal);
	}}

	

