import java.util.*;

class PostfixToInfix {
    static String convert(String str) {
        Stack<String> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String right = stack.pop();
                String left = stack.pop();
                stack.push("(" + left + ch + right + ")");
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String str = "ab+cd-*e+";
        System.out.println("POSTFIX EXPRESSION ::: " + str);
        System.out.println("INFIX EXPRESSION ::: " + convert(str));
    }
}
