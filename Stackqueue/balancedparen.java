import java.util.*;
public class balancedparen {
    public static boolean parentesischecker(String str)
    {
        Stack<Character> st=new Stack<>();
        char [] value=str.toCharArray();
        for(int i=0;i<value.length;i++)//()[{}()]{
        {
            if(value[i]=='(' || value[i]=='[' || value[i]=='{')
            {
                st.push(value[i]);
            }
            else{
                if (st.isEmpty()) return false;
                char ch=st.pop();
                 if( !((value[i] =='}' && ch=='{' )||( value[i] == ']' && ch=='[') ||( value[i]==')' && ch=='(')) )return false;
               

            }
        }

        return st.isEmpty();
    } 

    public static void main(String[]args)
{
    String str="(]}";
    if(parentesischecker(str)==true)
    {
        System.out.println("The String is The Parenthesis");
    }
    else System.out.println("The given value is not the parenthesis");
}}
