public class subequal{
    static void subsequence(int[] arr,int n, int ans)
    {
        if(n==4)
        {
            System.out.println(ans);
            return;
        } 
        subsequence(arr,n-1,ans+arr[n-1]);// Including the current element
        subsequence(arr, n-1, ans);// Not including the current element
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int target=4;
        int n=arr.length;
        subsequence(arr, n, 0);
    }
}