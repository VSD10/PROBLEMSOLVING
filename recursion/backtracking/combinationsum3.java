package backtracking;
import java.util.*;
// This is a Java program to find all unique combinations of k numbers that add up to a target number n.
// The numbers must be from 1 to 9 and each number can only be used once in the combination.
public class combinationsum3{
    static void  findcombination(int k, int index,int n,ArrayList<Integer> ans,List<List<Integer>> res)
    {
        if(n==0)
        {
            if(ans.size()==k) 
            {
               res.add(new ArrayList<>(ans));
            }
            return;
        }
        if(n<0 || index==10)
        {
            return;
        }
        ans.add(index);
        findcombination(k,index+1,n-index,ans,res);
        ans.remove(ans.size()-1);
        findcombination(k,index+1,n,ans,res);


    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        findcombination(k,1,n,new ArrayList<>(),res);
        return res;
    }

    
    public static void main(String[] args) {
        int k = 3; // Example value for k (number of elements in each combination)
        int target = 9; // Target sum
        List<List<Integer>> res = new combinationsum3().combinationSum3(k, target);

        for (List<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();

    }
}}