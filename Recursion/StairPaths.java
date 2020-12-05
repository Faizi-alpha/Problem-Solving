// Print all Stair Paths
	
  // Question link : https://www.geeksforgeeks.org/count-ways-reach-nth-stair/
  
  
import java.io.*;
import java.util.*;

class Git{
	
	public static void main(String args[]) throws IOException {
		
//    Use this for user input.
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
    
		printStairPaths(4,"");     // 4 is an example, you can take any integer
	}
 
	public static void printStairPaths(int n, String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return;
		}
		if(n < 0)
		{
			return;
		}
				
		printStairPaths(n-1,ans+"1");
		printStairPaths(n-2,ans+"2");
		printStairPaths(n-3,ans+"3");

	}
}
