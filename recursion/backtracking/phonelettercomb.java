import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// This program generates all possible letter combinations that the number could represent on a phone keypad.
// Each digit maps to a set of letters, similar to the old mobile phones.

class phonelettercomb {
    public List<String> letterCombinations(String digits) {
        List<String> r=new ArrayList<>();
        if(digits==null || digits.length()==0)return r;
        Map<Character,String> dol=new HashMap<>();
        dol.put('2',"abc");
         dol.put('3', "def");
        dol.put('4', "ghi");
        dol.put('5', "jkl");
        dol.put('6', "mno");
        dol.put('7', "pqrs");
        dol.put('8', "tuv");
        dol.put('9', "wxyz");
        backtrack(digits,0,new StringBuilder(),r,dol);
        return r;

    }
    private void backtrack(String digits,int i,StringBuilder c,List<String>r,Map<Character,String>dol)
    {
        if(i==digits.length())
        {
            r.add(c.toString());
            return;
        }
    String l=dol.get(digits.charAt(i));
    for(char let:l.toCharArray())
    {
        c.append(let);
        backtrack(digits,i+1,c,r,dol);
        c.deleteCharAt(c.length()-1);
        }
 }
public static void main(String[] args) {
        phonelettercomb obj = new phonelettercomb();
        String digits = "23";
        List<String> combinations = obj.letterCombinations(digits);
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

}