// Print Maze Paths with Jumps
// Problem link : https://www.youtube.com/watch?v=LgFl0hsyWP8&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=40

import java.io.*;
import java.util.*;

class Git{
	public static void main(String args[]) throws IOException {
		
//	    Use this for user input.
//	    Scanner sc = new Scanner(System.in);
//      int m = sc.nextInt();
//	    int n = sc.nextInt();
	
   	 	PrintJumps(1,1,3,3,"");  // example : for 3*3 matrix

	}
	
	public static void PrintJumps(int r,int c,int dr,int dc,String ans)
	{
		if(r == dr && c == dc)
		{
			System.out.println(ans);
			return;
		}

		
		for(int i=1;i<=dc-c;i++)
			PrintJumps(r,c+i,dr,dc,ans+"h"+i);   // h for horizontal move
		
		for(int i=1;i<=dr-r;i++)
		{
			PrintJumps(r+i,c,dr,dc,ans+"v"+i);   // v for vertical move
		}
		
		
		for(int j = 1;j<= dr-r&&j<= dc-c;j++)
		{
			PrintJumps(r+j,c+j,dr,dc,ans+"d"+j);  // d for diagonal move
		}
		
	}
 }
