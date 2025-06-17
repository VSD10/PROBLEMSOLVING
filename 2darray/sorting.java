import java.util.Arrays;
class sorting {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 2}, {4, 6, 5}, {9, 8, 7}};

          for(int x=0;x<a[0].length;x++)
       {
          
           for(int y=0;y<a.length;y++)
           {

            System.out.print(a[x][y]+" ");
            
           }
           System.out.println();
       }
       System.out.println("after sorting ::");
       
        for(int x=0;x<a[0].length;x++)
       {
           Arrays.sort(a[0]);
          
           for(int y=0;y<a.length;y++)
           {

            System.out.print(a[x][y]+" ");
            
           }
           System.out.println();
       }
       
       
       
       
         // New line aft.er each row
    
    }
}