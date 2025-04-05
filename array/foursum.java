package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Finds all unique quadruplets in the given array that sum up to the target
 * value.
 *
 * @param nums   the input array
 * @param target the target sum
 * @return a list of lists, where each inner list represents a unique quadruplet
 */
public class foursum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array first
        int start, end;

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) // Skip duplicates for i
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) // Skip duplicates for j
                    continue;

                start = j + 1; // Initialize the start pointer
                end = nums.length - 1; // Initialize the end pointer

                while (start < end) {
                    // Calculate the sum of the four numbers
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[start] + (long) nums[end];

                    // If sum matches the target, add the result and move the pointers
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;

                        // Skip duplicates for start and end
                        while (start < end && nums[start] == nums[start - 1])
                            start++;
                        while (start < end && nums[end] == nums[end + 1])
                            end--;
                    } else if (sum < target) {
                        start++; // Increase the sum by moving the start pointer right
                    } else {
                        end--; // Decrease the sum by moving the end pointer left
                    }
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        foursum fs = new foursum();
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        List<List<Integer>> result = fs.fourSum(nums, target);
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
