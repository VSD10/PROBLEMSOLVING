package binarysearch;
//
public class upperbound {
    public static void main(String[] args) {
        int []arr={3,5,8,15,19};
        int n=arr.length-1;
        int x=9;
        int i=0;
        int j=n-1;
        int ans=n;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(arr[mid]>x)
            {
                 ans=arr[mid];
                j=mid-1;

            }
            else{
                i=mid+1;
            }
        }
        System.out.println(ans);
    }
}
