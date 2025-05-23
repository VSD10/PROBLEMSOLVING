/**
 * The stringreverse class provides a method to reverse a given character array.
 */
class stringreverse {
    /**
     * Reverses the given character array in-place.
     * 
     * @param s the character array to be reversed
     */
    public void reverseString(char[] s) {
        int len = s.length;
        int start = 0;
        int end = len - 1;
        for (int i = 0; i < len / 2; i++) {
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        stringreverse solution = new stringreverse();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        solution.reverseString(s);
        System.out.println(s); // Expected output: "olleh"
    }
}