// Standard Backtracking problem N-Queens


import java.io.*;
import java.util.*;

public class NQueens {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[][] = new int[n][n];
        printNQueens(arr,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        if(row == chess.length)
        {
            System.out.println(qsf+".");
            return;
        }
       
        for(int i=0;i<chess.length;i++)
        {
            if(isConquored(chess,row,i) == false)
            {
             chess[row][i] = 1;
             printNQueens(chess,qsf+row+"-"+i+", ",row+1);
             chess[row][i] = 0;
            }
        }
        
    }
    
    public static boolean isConquored(int chess[][],int row,int col)
    {
        // check upper row
        for(int i = row;i>=0;i--)
        {
            if(chess[i][col] == 1)  return true;
        }
        
        // check right upper diaognal
        for(int i=row,j=col;i>=0 && j < chess.length;i--,j++)
        {
            if(chess[i][j] == 1) return true;
        }
        
        // check left upper diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(chess[i][j] == 1) return true;
        }
        
        return false;
    }
    
}
