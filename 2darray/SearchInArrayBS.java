class SearchInArrayBS {
    /**
     * Searches for a target value in a 2D matrix using binary search.
     *
     * @param matrix the 2D matrix to search in
     * @param target the target value to search for
     * @return true if the target value is found, false otherwise
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];
            if (midValue == target) return true;
            else if (midValue < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInArrayBS solution = new SearchInArrayBS();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50},
            {60, 61, 62, 63}
        };
        int target = 3;
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
}