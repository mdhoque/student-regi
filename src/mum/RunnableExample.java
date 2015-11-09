package mum;

public class RunnableExample {

	public static void main(String[] args) {

		Count cnt = new Count();;
		try{
		while(cnt.mythread.isAlive())
		{
			
		System.out.println("Main thread will be alive till child thread is alive");	

		Thread.sleep(1500);
		}
		}catch(InterruptedException e){
			
			System.out.println("Main Thread interupted");
			
		}
		
		System.out.println("Main thread run is over");
		

	}

}
