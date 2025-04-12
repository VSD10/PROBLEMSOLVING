class searchinrotatedarray {
    /**
     * Searches for a target value in a rotated sorted array.
     *
     * This method uses a modified binary search algorithm to find the target value
     * in a rotated sorted array. The array is assumed to be sorted in ascending order
     * and then rotated at some pivot unknown to the method.
     *
     * @param nums   The rotated sorted array of integers.
     * @param target The target value to search for.
     * @return The index of the target value if found, otherwise -1.
     */
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // Right half is sorted
                // Target is in the right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1; // Target not found

    }
    public static void main(String[] args) {
        searchinrotatedarray s = new searchinrotatedarray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(s.search(nums, target)); // Output: 4
    }
}