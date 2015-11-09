package mum;

public class jointh implements Runnable {
	
	public void run(){
		
		Thread t = Thread.currentThread();
		System.out.println("Tread started :"+ t.getName());
		try{
			
			t.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Tread Ended :" + t.getName());
	}

}
