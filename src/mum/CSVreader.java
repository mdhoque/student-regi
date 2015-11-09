package mum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String line="";
		BufferedReader bf=null;
		
		try{
			  bf = new BufferedReader(new FileReader("/d:/gp.csv"));
           
			 while((line = bf.readLine()) != null){
				 
				 String[] country = line.split(",");
				 
				 System.out.println("country is :"+country[5] + "Code is: "+ country[4]);
			 }
			
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		finally{
			
			bf.close();
		}
	}

}
