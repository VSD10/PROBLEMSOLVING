class setmatrixzero {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 0, 5}, {7, 8, 9}};
        int m = arr.length;
        int n = arr[0].length;

        // Create boolean arrays to mark rows and columns that need to be zeroed
        boolean[] rowToZero = new boolean[m];
        boolean[] colToZero = new boolean[n];

        // First pass: Identify which rows and columns contain a zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    rowToZero[i] = true;
                    colToZero[j] = true;
                }
            }
        }

        // Second pass: Set elements to zero based on the marked rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowToZero[i] || colToZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        // Print the modified array
        System.out.println("Modified Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
             {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}