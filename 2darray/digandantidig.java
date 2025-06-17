//this is a program to print the diagonal and anti-diagonal elements of a 2D array

class digandantidig {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3,33}, {4, 5, 6,66}, {7, 8, 9,99},{11,22,33,44}};

          for(int x=0;x<a[0].length;x++)
       {
          
           for(int y=0;y<a.length;y++)
           {
                 // System.out.print('0');
            if(x==y)
            System.out.print(a[x][y]+" ");
            else
            System.out.print("  ");
               
           }
           System.out.println();
       }
       
   
       
       for(int x=0;x<a[0].length;x++)
       {
           for(int y=0;y<a.length;y++)
           {
                 // System.out.print('0');
               if(x+y==a.length-1)
               System.out.print(a[x][y]+" ");
               else
               System.out.print("  ");
               
           }
           System.out.println();
       }
       
       
         
    
    }
}