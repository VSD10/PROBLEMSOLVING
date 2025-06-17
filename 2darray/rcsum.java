
// This code calculates the sum of each row and column in a 2D array.
class Main {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        for(int[] x:a)
        {
            for(int y:x)
            System.out.print(y+" ");
        System.out.println();
        }
        
    
        for(int x=0;x<a[0].length;x++)
        {
            int row=0,column=0;
            for(int y=0;y<a.length;y++)
            {
                row+=a[x][y];
                column+=a[y][x];
                
            }
            System.out.println("The sum of Row "+x+' '+row);
            System.out.println("The sum of column "+x+' '+column);
            
        }
    }
}