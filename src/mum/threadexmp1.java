package mum;

public class threadexmp1 implements Runnable{
	
	public void run(){
		
		System.out.println("thread is running");
	}
	
	

	public static void main(String[] args) {
	
		threadexmp1 thrd = new threadexmp1();
		Thread newtrd = new Thread(thrd);
     		newtrd.start();
	}

}
