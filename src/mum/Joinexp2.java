package mum;

public class Joinexp2 {

	public static void main(String[] args){
	
  Thread td1 = new Thread(new jointh(),"th1");
  Thread td2 = new Thread(new jointh(),"th2");
  Thread td3 = new Thread(new jointh(),"th3");
		
 td1.start();
 td2.start();
 td3.start();
		
		
}
}