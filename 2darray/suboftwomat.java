class suboftwomat {
    /**
     * This program prints two matrices side by side with a '-' in the middle,
     * and the result of subtracting the second matrix from the first.
     * The matrices are printed in a formatted way for better readability.
     */
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};

        for (int x = 0; x < a.length; x++) { // Iterate through rows
            // Print Matrix A row
            for (int y = 0; y < a[0].length; y++) { // Iterate through columns
                System.out.printf("%-4d", a[x][y]); // Use printf for formatted spacing
            }

            // Print '+' in the middle vertically
            if (x == a.length / 2) {
                System.out.print("  -   ");
            } else {
                System.out.print("      "); // Maintain spacing for other rows
            }

            // Print Matrix B row
            for (int y = 0; y < b[0].length; y++) {
                System.out.printf("%-4d", b[x][y]);
            }

            // Print '=' in the middle vertically
            if (x == a.length / 2) {
                System.out.print("  =   ");
            } else {
                System.out.print("      "); // Maintain spacing for other rows
            }

            // Print Result Matrix row (A + B)
            for (int y = 0; y < a[0].length; y++) {
                System.out.printf("%-4d", (a[x][y] - b[x][y]));
            }
            System.out.println(); // New line after each row
        }
    }
}