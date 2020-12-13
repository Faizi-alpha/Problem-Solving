import java.util.*;


class Rat_In_Maze {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();

     while (t-- > 0) {
         int n = sc.nextInt();
         int[][] a = new int[n][n];
         for (int i = 0; i < n; i++)
             for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

         ax g = new ax();
         ArrayList<String> res = g.printPath(a, n);
         if (res.size() > 0) {
             for (int i = 0; i < res.size(); i++)
                 System.out.print(res.get(i) + " ");
             System.out.println();
         } else {
             System.out.println(-1);
         }
     }
 }
}

class ax {
 
 static ArrayList<String> res;
 public static ArrayList<String> printPath(int[][] m, int n) {
     
     res = new ArrayList<String>();
     helper(m,0,0,"");
     return res;
     
 }
 
 //  Rat in Maze :
 // 0 means blocked and 1 means free to move
 
 public static void helper(int[][] m,int r,int c,String ans)
 {
     if( r == m.length-1 && c== m.length-1 && m[r][c] != 0)
     {
         res.add(ans);
         return;
     }
     
     
     if(r >= m.length || r < 0 || c >= m.length || c < 0 || m[r][c] == 0)
         return;
     
     m[r][c] = 0;
     helper(m,r+1,c,ans+"D");
     helper(m,r,c-1,ans+"L");
     helper(m,r,c+1,ans+"R");
     helper(m,r-1,c,ans+"U");
     m[r][c] = 1;
 }
 
 
}
