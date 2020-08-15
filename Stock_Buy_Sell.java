// Infinte Transactions allowed .
// Given array where each element denotes the price of stock at particular day . We need to maximize the profit

import java.io.*;
import java.util.*;
import java.lang.Math;

class Interval
{
    int buy;
    int sell;
}



public class GFG 
{
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int T =s.nextInt();
	
	while(T-->0)
	{
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = s.nextInt();
		}
		
		if(n == 2)
		{
		   int td = arr[1]-arr[0];
		   if(td>0)
		   {
		       System.out.println("(0 1)");
		   }
		   else
		   {
		       System.out.println("No Profit");
		   }
		}
		else
		{
		    Stock(arr,n);
		}
		
	}
	
}
   public static void Stock(int arr[] , int n)
   {
       ArrayList<Interval> al = new ArrayList<>();
      
       
       int i = 0;
       int count = 0;
       while(i<n-1)
       {
           // Find local minima so that we purchase on that day
          while((i<n-1) && arr[i]>=arr[i+1])
               i++;
          
          if(i == n-1)
             break;
          Interval e = new Interval();
          e.buy = i;
          i++;
          
          // Find local maxima so that we sell on that day
          
          while((i<n-1) && arr[i]<=arr[i+1])
             i++;
             
         e.sell = i;
         // add to arraylist
         al.add(e);
         count++;
       }
       
       if(count == 0)
       {
           System.out.println("No Profit");
       }
       else
       {
           for(int k=0;k<count;k++)
           {
               System.out.print("("+al.get(k).buy+" "+al.get(k).sell+")"+" ");
           }
           System.out.println();
       }
       
       
   }
}
