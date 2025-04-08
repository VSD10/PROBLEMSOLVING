
import java.util.Arrays;

/**
 * The Threesumclosest class calculates the sum of three integers in an array that is closest to a target value.
 */
public class Threesumclosest {
    /**
     * Finds the sum of three integers in the given array that is closest to the target value.
     *
     * @param nums   The array of integers.
     * @param target The target value.
     * @return The sum of three integers that is closest to the target value.
     */
    public int threeSumClosest(int[] nums, int target) {
        int min = nums[0] + nums[1] + nums[2];
        int start, end;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            start = i + 1;
            end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - min)) {
                    min = sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Threesumclosest ts = new Threesumclosest();
        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        int result = ts.threeSumClosest(nums, target);
        System.out.println(result); // Output: 2
    }
}
