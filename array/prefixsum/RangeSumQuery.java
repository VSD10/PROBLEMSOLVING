//https://leetcode.com/problems/range-sum-query-immutable/
//Given an integer array nums, handle multiple queries of the following type:
//Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
class RangeSumQuery {
    private int[] prefix;

    public  RangeSumQuery(int[] nums) {
        // prefix[0] = 0 for easier calculation
        prefix = new int[nums.length + 1]; 

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public  int sumRange(int left, int right) {
        // sum from index left to right = prefix[right + 1] - prefix[left]
        return prefix[right + 1] - prefix[left];
    }
    public static void main(String args[]) {
        int arr[]={-2,0,3,-5,2,-1};
        RangeSumQuery obj=new RangeSumQuery(arr);
        System.out.println(obj.sumRange(0,2));

    }

}
