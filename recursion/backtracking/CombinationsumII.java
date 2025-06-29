import java.util.ArrayList;
import java.util.Arrays;

public class CombinationsumII{
    static void  findcombination(int[]arr,int n, int index,int target,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        if(target<0 || index==n)
        {
            return;
        }
        ans.add(arr[index]);
        findcombination(arr,n,index+1,target-arr[index],ans,res);
        ans.remove(ans.size()-1);
        while(index+1<n && arr[index]==arr[index+1]) index++; // Skip duplicates
        findcombination(arr,n,index+1,target,ans,res);


    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        findcombination(arr,n,0,target,new ArrayList<>(),res);
        return res;
        
    }
    
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5}; 
        int target = 8;
        ArrayList<ArrayList<Integer>> res = combinationSum(arr, target);

        for (ArrayList<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();

    }
}}