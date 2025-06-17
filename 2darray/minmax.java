// MinMax of 2D Array
class minmax {
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
            int row=a[x][0],column=a[0][x];
            int maxr=0,maxc=0;
            for(int y=0;y<a.length;y++)
            {
                maxr=Math.max(row,a[x][y]);
                maxc=Math.max(column,a[y][x]);
                row=Math.min(row,a[x][y]);
                column+=Math.min(column,a[y][x]);
                
            }
            System.out.println("The max & min of Row "+row+' '+maxr);
            System.out.println("The max & min of column "+column+' '+maxc);
            
        }
    }
} 
