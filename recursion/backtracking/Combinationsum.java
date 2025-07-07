import java.util.ArrayList;

public  class Combinationsum {
     
    static void findCombinations(int[] arr,int target, int index,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> res) {
        if(target==0)
        {

            res.add(new ArrayList<>(ans));
            return;
        }
        if(target<0 || index==arr.length)
        {
            return;
        }
        ans.add(arr[index]);
        findCombinations(arr, target-arr[index], index, ans, res);
        ans.remove(ans.size()-1);
        findCombinations(arr, target, index+1, ans, res);
    }

    
    
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        findCombinations(arr, target, 0, ans, res);
        return res;
    }



    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 8;
        ArrayList<ArrayList<Integer>> res = combinationSum(arr, target);

        for (ArrayList<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
    }
    
}}
