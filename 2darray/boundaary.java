// This Java program prints the boundary elements of a 2D array.
class boundaary {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

          for(int x=0;x<a[0].length;x++)
       {
          
           for(int y=0;y<a.length;y++)
           {
                 // System.out.print('0');
            if(x==0||y==0||x==a.length-1||y==a.length-1)
            System.out.print(a[x][y]+" ");
            else
            System.out.print("  ");
          
         
               
           }
           System.out.println();
       }
       
   
       
       
       
       
         // New line aft.er each row
    
    }
}