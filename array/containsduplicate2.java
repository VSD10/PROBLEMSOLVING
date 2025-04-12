import java.util.HashMap;

public class containsduplicate2 {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(nums[x])) {
                if (x - map.get(nums[x]) <= k) {  // Fix is here
                    return true;
                }
            }
            map.put(nums[x], x);  // Always update the latest index
        }
        return false;
    }

    public static void main(String[] args) {
        containsduplicate2 c = new containsduplicate2();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = c.containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result);
    }
}
