// Print Keypad Combination 

import java.io.*;
import java.util.*;

class dr{
	
	static String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String args[]) throws IOException {
		
    keypad("23","");
	}

  
	
	public static void keypad(String s,String ans)
	{		
		if(s.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		char c = s.charAt(0);
		String currKey = arr[c-'0'-2];
		for(int i=0;i<currKey.length();i++)
		{
			keypad(s.substring(1),ans+currKey.charAt(i));
		}
		
	}
