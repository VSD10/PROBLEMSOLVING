//["geeksforgeeks","geeks","geek", "geezer"]   gee
//["apple","ape","april"]   ap
//["hello","world"] ''

import java.util.*;

class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        StringBuilder s=new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(s.toString())){
                s.deleteCharAt(s.length()-1);
            }
        }
        
        return s.toString();
    }
    public static void main(String[] args) {
        String[] str = {"geeksforgeeks","geeks","geek", "geezer"};
        System.out.println(longestCommonPrefix(str));

    }
}
