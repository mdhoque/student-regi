package mum;

public class Count implements Runnable {
	
	Thread mythread;
	
	Count(){
		
		mythread = new Thread(this, "My runnable thread");
		System.out.println("My tread created"+ mythread);
		mythread.start();
	}
  
	public void run(){
		try{
		for(int i=0; i<10;i++){
			
			System.out.println("Printing the count "+i);
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				
			   System.out.println("my thread interupted");
			}
		System.out.println("mythread run is over");
		
		}
		
	}

