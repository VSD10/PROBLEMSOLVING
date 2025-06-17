// Zigzag Pattern in a 2D Array
// This Java program prints a zigzag pattern in a 2D array.
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

          for(int x=0;x<a[0].length;x++)
       {
          
           for(int y=0;y<a.length;y++)
           {
            if(x==0||x==a.length-1||x==y)
            System.out.print(a[x][y]+" ");
            else
            System.out.print("  ");
            
           }
           System.out.println();
       }
       
       
       
       
         // New line aft.er each row
    
    }
}