	// Print Permutations
  // Problem : Program to print all possible permutations of a given string
  
  // For example given string is "abc"
  // All possible permutations of abc are : abc ,acb ,bac ,bca ,cab ,cba

  
import java.io.*;
import java.util.*;

class stringPermutations{
	public static void main(String args[]) throws IOException {
		
//	    Use this for user input.
//	    Scanner sc = new Scanner(System.in);
//	    String n = sc.next();
	
		permutations("abc","");
	}
  
	public static void permutations(String src, String ans)
	{
		if(src.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<src.length();i++)
		{	
			char c = src.charAt(i);
			String left = src.substring(0,i);
			String right = src.substring(i+1);
			permutations(left+right,ans+c);
		}
	}
  }
