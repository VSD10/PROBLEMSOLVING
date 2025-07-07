class test{


    static ArrayList<ArrayList<Integer>>list combinationSum(String a)
    {
        System.out.print(a)
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(a);

        ArrayList<Integer> ans = new ArrayList<>();
        findCombinations(arr, target, 0, ans, res);
        return res;

    }

    public static void main(String[]args)
    {
        String a="23";
        
        ArrayList<ArrayList<Integer>> list=combinationSum(a);
        for(ArrayList<Integer> a:list)
        {
            System.out.print(a);
               }
    }
}