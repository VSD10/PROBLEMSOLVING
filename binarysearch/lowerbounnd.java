package binarysearch;
// This class is intended to find the lower bound of a target value in a sorted array.
// // The lower bound is the index of the first element that is not less than the target.
public class lowerbounnd {
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
            if(arr[mid]>=x)
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
