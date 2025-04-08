//using the sliding window finding the maximum value in the array
//then finding the average of it...

class findmaxaverage {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int x=0;x<k;x++)
        {
            sum+=nums[x];
        }
        int start=0;
        int end=k;
        int max=sum;
        while(end<nums.length)
        {
            sum-=nums[start++];
            sum+=nums[end++];
            max=Math.max(max,sum);
        }
        
        return (double) max/k;

        
    }
    public static void main(String[]args )
    {
        findmaxaverage f = new findmaxaverage();
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double result = f.findMaxAverage(nums, k);
        System.out.println("The maximum average is: " + result);
    }
}