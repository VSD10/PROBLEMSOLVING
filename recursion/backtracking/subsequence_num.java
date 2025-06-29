public class subsequence_num{
    static void subsequence(String[]arr,int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        } 
        subsequence(arr, n-1, ans);// Not including the current element
        subsequence(arr,n-1,ans+arr[n-1]);// Including the current element
        
    }
    public static void main(String[] args) {
        String[]arr={"a","b","c"};
        int n=arr.length;
        subsequence(arr, n, "");
    }
}