
import java.io.*;
public class Letter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\Shabab Khwaja\\Desktop\\reader.txt"); 
		
		int i; 
		int count = 0;
		char t = 'e';
		String s1 = " ";
		String result = " ";
		int indexOfSubStr = 0;
	    while ((i=fr.read()) != -1) {
	    	result = s1 + " " + (char) i;
	    	//System.out.print(result);
	    		
	    	if(i == 'e') {
	    		
	    		indexOfSubStr = result.indexOf('e');
	    		
	    		count++;
	    	}
	    }
	    System.out.println("The alphabet e comes at postion " + indexOfSubStr);
	    System.out.println("The alphabet e occurs " + count + " times");
	  } 
	}

	


