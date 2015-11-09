package mum;

public class stringcompare {

	public static void main(String[] args) {
		// TODO Auto

		String[] s = new String[]{"shahed", "shahin","akbar","abbas","shahed"};
		String temp="" ;
		
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
			
			if(s[i].compareTo(s[j])>0){
				temp= s[i];
			    s[i]=s[j];
			    s[j]=temp;}
		}}

		for(int i=0;i<s.length;i++){

		System.out.println(s[i].toString());
		}	}

}
