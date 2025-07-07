import java.util.Stack;
class a{

    static int prec(char c)
    {
        switch(c)
        {
            case'+':
            case'-':
                return 1;
            case'*':
            case'/':
                return 2;
            case'^':
                return 3;
        }
        return -1;
    }

    static String infixtopostfix(String str)
{
    String result=new String("");
    Stack<Character> s=new Stack<>();
    for(int i=0;i<str.length();++ i);
    {
        char c=str.charAt(i);
        if(Character.isLetterOrDigit(c))
            result+=c;
        else if(c=='(')
            s.push(c);
        else if(c==')')
        {
            while(!s.isEmpty()&& s.peek()!='(')
                result+=s.pop();
        }
        else{
            while(!s.isEmpty() && prec(c)<=prec(s.peek()))
            {
                result+=s.pop();
            }
            s.push(c);
        }
    }
}
    public static void main(String[]vsd)
    {
        String exp="(p+q)*(m-n)";
        System.out.println("Infix expression"+exp);
        System.out.println("prefix expression"+ infixtopostfix(exp));
    
    
    }
}