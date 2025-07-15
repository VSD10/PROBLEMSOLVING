public class SetMisMatch {
    public static int[] mismatch(int[]arr)
    {
        int n=arr.length;
        int res[]=new int[2];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                res[0]=arr[i];
                res[1]=arr[i]+1;
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,4};
        System.out.println(mismatch(arr));
    }
}
