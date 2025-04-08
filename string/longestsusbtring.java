import java.util.HashSet;
import java.util.Set;

public class longestsusbtring {
   
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        Set <Character>set=new HashSet<>();
        int maxlen=0;
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
    }
    public static void main(String[] args) {
        longestsusbtring l = new longestsusbtring();
        String s = "abcabcbb";
        int result = l.lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
} 

