import java.util.*;
public class SubArrayzero {
    
    public static void main(String[] args) {
        int arr[]={4,2,-3,1,6};
        int sum=0;
        Set<Integer> s=new HashSet<>();
        s.add(sum);
        if(arr[0]==0) System.out.println("TRUE");
        sum+=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0) System.out.println("trwue");
            sum+=arr[i];
            if(s.contains(sum)|| s.contains(0)) System.out.println(true);
            else{
                s.add(sum);
            }

        }

    }
}
