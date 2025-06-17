
// This Java program prints the upper and lower triangular parts of a 2D array.
public class utlt {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      System.out.println("Upper Traigle");
          for(int x=0;x<a[0].length;x++)
       {
          
           for(int y=0;y<a.length;y++)
           {
                 // System.out.print('0');
            if(x>y)
            System.out.print("  ");
            else
            System.out.print(a[x][y]+" ");
               
           }
           System.out.println();
       }
       
        System.out.println("Lower Traigle");
       
       for(int x=0;x<a[0].length;x++)
       {
           for(int y=0;y<=x;y++)
           {
                 // System.out.print('0');
            
               System.out.print(a[x][y]+" ");
               
           }
           System.out.println();
       }
       
       
         // New line aft.er each row
    
    }
} 