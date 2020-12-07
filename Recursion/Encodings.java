// Print Encodings
// Problem link : https://www.youtube.com/watch?v=jUo0Qis4FKU&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=44

import java.io.*;
import java.util.*;

class Encodings{
	public static void main(String args[]) throws IOException {
		
//	    Use this for user input.
//	    Scanner sc = new Scanner(System.in);
//	    String src = sc.nextInt();
	    

		    PrintEncodings("103","");  // 103 is taken for sample

	}
	
	
	
    public static void PrintEncodings(String src , String ans)
    {
    	if(src.length() == 0)
    	{
    		System.out.println(ans);
    		return;
    	}
    	if(src.charAt(0) == '0')
    	{
    		return;
    	}

        int cr = src.charAt(0)-'0'-1;  // '1'
        char k = (char)(cr+'a');            
        PrintEncodings(src.substring(1),ans+k);
        
        if(src.length() >=2)
        {
        	int after = Integer.parseInt(src.substring(0,2))-1;
        	if(after <= 26)
        		PrintEncodings(src.substring(2),ans+(char)(after+'a'));
        }  
        
        
     }
    }
