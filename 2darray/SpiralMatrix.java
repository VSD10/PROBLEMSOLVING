class SpiralMatrix
{
    static void spiralmat(int[][] arr,int n,int m)
    {
        int right=m-1;
        int left=0;
        int top=0;
        int down=n-1;
        while(left<=right && top<=down)
        {
           // System.out.println(1);
            for(int i=left;i<=right;i++)
            {
                System.out.println(arr[top][i]);
            }
            top++;
            for(int i=top;i<=down;i++)
            {
                System.out.println(arr[i][right]);
            }
            right--;
            if(top<=down)
            {
            for(int i=right;i>=left;i--)
            {
                System.out.println(arr[down][i]);
            }
            down--;
            }
            if(left<=right)
            {
                for(int i=down;i>=top;i--)
                {
                    System.out.println(arr[i][left]);
                }
                left++;
            }

        }

    }    public static void main(String[]vsd)
    {
       int[][]arr={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
    //    int[][] arr = {
    //     {1, 2, 3, 4},
    //     {5, 6, 7, 8},
    //     {9,10,11,12}
    // };
    
        int n=arr.length;
        int m=arr[0].length;
        // System.out.println(n);
        // System.out.println(m);
        
        spiralmat(arr, n, m);
    }
}