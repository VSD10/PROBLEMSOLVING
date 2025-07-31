import java.util.HashSet;
import java.util.Set;

public class longestsusbtring {
    
        public int lengthOfLongestSubstring(String s) {
         int start=0;
            int end=0;
            Set <Character>set=new HashSet<>();
            int maxlen=0;
            while(end<s.length())
            {
                if(!set.contains(s.charAt(end)))
                {
                    set.add(s.charAt(end));
                    end++;
                }
                else
                {
                    set.remove(s.charAt(start));
                    start++;
                }
                maxlen=Math.max(maxlen,end-start);
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

