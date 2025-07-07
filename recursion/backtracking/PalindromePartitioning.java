package backtracking;
import java.util.*;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                current.add(s.substring(start, i + 1));
               // System.out.println(current);// add the palindrome substring ex: "a", "aa", "b"
                backtrack(i + 1, s, current, result);
                // move to the next index after the palindrome
                current.remove(current.size() - 1);
               // 
                System.out.println("Backtracking: " + current);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioning pp = new PalindromePartitioning();
        String s = "aab";
        pp.partition(s);
        //System.out.println(pp.partition(s));
    }
}
