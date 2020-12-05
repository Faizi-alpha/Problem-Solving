// Print Maze Paths
// Problem link : https://www.youtube.com/watch?v=TcCyI-eJMmY&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=38

import java.io.*;
import java.util.*;

class dr{
	
	static String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String args[]) throws IOException {
		
//	    Use this for user input.
//	    Scanner sc = new Scanner(System.in);
//      int m = sc.nextInt();
//	    int n = sc.nextInt();

		PrinttMazePaths(0,0,2,2,"");    // for 3*3 matrix
	
	}

	public static void PrintMazePaths(int r,int c,int dr,int dc,String ans)
	{
		if(r == dr && c == dc)
		{
			System.out.println(ans);
			return;
		}
		
		if(r > dr || c > dc)
			return;
		
		PrintMazePaths(r+1,c,dr,dc,ans+"h");   // h for horizontal move
		PrintMazePaths(r,c+1,dr,dc,ans+"v");   // v for vertical move
		
	}
