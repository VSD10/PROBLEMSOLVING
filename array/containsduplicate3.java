import java.util.HashMap;

class containsduplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
     
        
    HashMap<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(nums[x])) {
                int j=map.get(nums[x]);
                if ((x - j) <= indexDiff && nums[x]-nums[j]<=valueDiff && x!=j) {  // Fix is here
                    return true;
                }
            }
            map.put(nums[x], x);  // Always update the latest index
        }
        return false;
    }
    public static void main(String[] args) {
        containsduplicate3 c = new containsduplicate3();
        int[] nums = {1, 5, 9, 1, 5, 9};
        int indexDiff = 2;
        int valueDiff = 3;
        boolean result = c.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
        System.out.println("Contains nearby almost duplicate: " + result);
    }
}