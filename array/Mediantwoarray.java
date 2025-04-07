/**
 * The Mediantwoarray class calculates the median of two sorted arrays.
 */
package array;

class Mediantwoarray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        // Merge both arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        // If there are remaining elements in nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        
        // If there are remaining elements in nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        
        // Now calculate the median from the merged array
        int size = merged.length;
        if (size % 2 != 0) {
            return merged[size / 2];
        } else {
            return (merged[size / 2 - 1] + merged[size / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Mediantwoarray solution = new Mediantwoarray();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);  // Output: Median: 2.0
    }
}
