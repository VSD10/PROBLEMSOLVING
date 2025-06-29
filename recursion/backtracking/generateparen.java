
// LeetCode Problem: Generate Parentheses
import java.util.ArrayList;
import java.util.List;
class generateparen {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
     
        bt(0,0,"",n,res);
        return res;
    }
    private void bt(int op,int cl,String s,int n,List<String>res)
    {
        if(op==cl&& op+cl==2*n)
        {
            res.add(s);
            return;
        }
        if(op<n)
        {
            bt(op+1,cl,s+"(",n,res);
        }
        if(cl<op)
        {
            bt(op,cl+1,s+")",n,res);
        }
    }
    public static void main(String[] args) {
        generateparen sol = new generateparen();
        int n = 3; // Example input
        List<String> result = sol.generateParenthesis(n);
        System.out.println(result); // Output the generated parentheses
    }
}