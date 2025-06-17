//comparing two 2D arrays for symmetry

class symmetric {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        int[][] b = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        
        boolean isSymmetric = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("The two arrays are symmetric.");
        } else {
            System.out.println("The two arrays are not symmetric.");
        }
    }
}