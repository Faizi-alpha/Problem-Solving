// Backtracking Knights Tour Problem

import java.io.*;
import java.util.*;

public class KnightsTour {
    public static int c;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int chess[][] = new int[size][size];
        printKnightsTour(chess,row,col,size*size,1);
        
    }
    
public static void printKnightsTour(int[][] chess,int row,int col,int trgt,int move) {
        
        if(row >= chess.length || col >= chess.length || row < 0 || col < 0 || chess[row][col] > 0)
        {
            return;
        }
        else if(move == trgt)
        {
            chess[row][col] = move;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }
         
        chess[row][col] = move;
        printKnightsTour(chess,row-2,col+1,trgt,move+1);
        printKnightsTour(chess,row-1,col+2,trgt,move+1);
        printKnightsTour(chess,row+1,col+2,trgt,move+1);
        printKnightsTour(chess,row+2,col+1,trgt,move+1);
        printKnightsTour(chess,row+2,col-1,trgt,move+1);
        printKnightsTour(chess,row+1,col-2,trgt,move+1);
        printKnightsTour(chess,row-1,col-2,trgt,move+1);
        printKnightsTour(chess,row-2,col-1,trgt,move+1);
        chess[row][col] = 0;
        
    }
    
    
   
    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
