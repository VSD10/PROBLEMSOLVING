import java.lang.reflect.Array;
import java.util.*;
public class lettercombination
{
    static ArrayList<String> pad(String p, String up, ArrayList<String> ans) {
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = pad(p + ch, up.substring(1), new ArrayList<>(ans));
        ArrayList<String> right = pad(p, up.substring(1), new ArrayList<>(ans));
        left.addAll(right);
        return left;
    }
    

    public static void main(String[] args) {
        ArrayList<String> result = pad("", "12", new ArrayList<String>());
        System.out.println(result);
    }
}