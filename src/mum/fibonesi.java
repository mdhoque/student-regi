package mum;

public class fibonesi {

	public static void main(String[] args) {
		
		int count =8;
		int[] fb = new int[count];
		fb[0]=0;
		fb[1]=1;
		
		for(int i=2;i<count;i++){
			
			fb[i]= fb[i-1]+fb[i-2];
			
		}
		
		for(int i=0;i<count;i++){
			
			System.out.println( fb[i]+" ");
		}

	}

}
