package mum;

public class Task implements Runnable{
	
	private int taskid;
	
	public Task(int id){
		
		this.taskid= id;
			
	}

	public void run(){
		
	System.out.println("Task ID :" + this.taskid +" Performed by :" + Thread.currentThread().getName());
		
	}
	
}
