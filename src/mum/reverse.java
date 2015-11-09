package mum;

public class reverse {

	public static void main(String[] args) {

		String str = "shahed";
		char[] str1 = str.toCharArray();
		String strr ="";
		for(int i=str.length()-1; i>=0;i--){
			
		//	System.out.println(str1[i]);
		    strr+=str1[i];	
		}
 		
		System.out.println(strr);
		
		

	}

}
