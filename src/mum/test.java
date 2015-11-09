package mum;

public class test {
	
	
	
	
	public static void sortedAnagramString(String str[]){
		char[] finalSorted;
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].length() == str[j].length()){
					checkEachChar(str[i],str[j]);
				}
			}
		}
		
	}
	public static void checkEachChar(String str1, String str2){
		int k=0;
		for(int i=0; i<str1.length();i++){
			 for(int j=0; i<str2.length();j++)
			if(str1.charAt(i)==str2.charAt(j))
				k++;
		}
		
		if(str1.length()==k){
			
			
		}
		
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] ={"ROMA","RAMO","AMOR"};
		sortedAnagramString(str);
		System.out.println("shahed");
		
	}

}
