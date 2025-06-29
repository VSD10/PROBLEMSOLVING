
import java.util.*;

public class subset {

    static void  Subset(int[] arr,int n,int index,ArrayList<Integer>ans,ArrayList<ArrayList<Integer>>res)
    {
        if(index==n)
        {
            if(ans.isEmpty()) {
                ans.add(0); // To include the empty subset
            }
            res.add(new ArrayList<>(ans));
            
            return;
        }
        ans.add(arr[index]);
        Subset(arr,n,index+1,ans,res);
        ans.remove(ans.size()-1);
    
        while(index+1<n && arr[index]==arr[index+1]) index++; 
        Subset(arr,n,index+1,ans,res);

    }
    static ArrayList<ArrayList<Integer>> ss(int[]arr,int n)
    {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int index=0;
        Subset(arr,n,index, new ArrayList<Integer>(),res);
        return res;

    }



     public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n=arr.length;
        ArrayList<ArrayList<Integer>> res = ss(arr, n);

        for (ArrayList<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
    }
}}
