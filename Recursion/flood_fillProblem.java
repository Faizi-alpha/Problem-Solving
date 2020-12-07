// Flood Fill Problem
// Problem link : https://www.youtube.com/watch?v=FkkgY7qQF_s&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=46

import java.io.*;
import java.util.*;

class flood_fillProblem{
	public static void main(String args[]) throws IOException {
  
		Scanner sc = new Scanner(System.in);
	      int m = sc.nextInt();
	      int n = sc.nextInt();
	      
	     
	      int maze[][] = new int[m][n];
	      for(int i=0;i<m;i++)
	      {
	          for(int j=0;j<n;j++)
	          {
	              maze[i][j] = sc.nextInt();
	          }
	      }
	      boolean visited[][] = new boolean[m][n];
	      floodfill(maze,0,0,"",visited);
		
	}
	
	public static void floodfill(int maze[][], int row,int col, String ans, boolean visited[][])
	{
		if(row == maze.length-1 && col == maze[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		if(row == maze.length || col == maze[0].length || row < 0 || col < 0 || maze[row][col] == 1 || visited[row][col] == true)
				return;
		
		
		visited[row][col] = true;   // Mark as visited
		floodfill(maze,row-1,col,ans+"t",visited); // t -> top
		floodfill(maze,row,col-1,ans+"l",visited); // l -> left
		floodfill(maze,row+1,col,ans+"d",visited); // d -> down
		floodfill(maze,row,col+1,ans+"r",visited); // r -> right
		visited[row][col] = false;  // Since we moved in all directions now we mark that that position as unvisited
	}
