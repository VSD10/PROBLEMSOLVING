 import java.util.Stack;

// class infixToPostfix {

//   // A utility function to return
//   // precedence of a given operator
//   // Higher returned value means
//   // higher precedence
  // static int Prec(char ch) {
  //   switch (ch) {
  //   case '+':
  //   case '-':
  //     return 1;

  //   case '*':
  //   case '/':
  //     return 2;

  //   case '^':
  //     return 3;
  //   }
  //   return -1;
  // }

//   // The main method that converts
//   // given infix expression
//   // to postfix expression.
//   static String infixToPostfix(String exp) {
//     // initializing empty String for result
//     String result = new String("");

//     // initializing empty stack
//     Stack < Character > stack = new Stack < > ();

//     for (int i = 0; i < exp.length(); ++i) {
//       char c = exp.charAt(i);

//       // If the scanned character is an
//       // operand, add it to output.
//       if (Character.isLetterOrDigit(c))
//         result += c;

//       // If the scanned character is an '(',
//       // push it to the stack.
//       else if (c == '(')
//         stack.push(c);

//       // If the scanned character is an ')',
//       // pop and output from the stack
//       // until an '(' is encountered.
//       else if (c == ')') {
//         while (!stack.isEmpty() && stack.peek() != '(')
//           result += stack.pop();

//         stack.pop();
//       } else // an operator is encountered
//       {
        
//         while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {// While top of 'operator' has greater precedence example: if stack= '+' and c='*', then we pop '+' and push '*' in stack. 
//           result += stack.pop();
//         }
//         stack.push(c);
//       }

//     }

//     // pop all the operators from the stack
//     while (!stack.isEmpty()) {
//       if (stack.peek() == '(')
//         return "Invalid Expression";
//       result += stack.pop();
//     }
//     return result;
//   }

//   // Driver method
//   public static void main(String[] args) {
//     String exp = "(p+q)*(m-n)";
//     System.out.println("Infix expression: " + exp);
//     System.out.println("Prefix expression: " + infixToPostfix(exp));
//   }
// }
class infixToPostfix{
  static int Prec(char ch) {
    switch (ch) {
    case '+':
    case '-':
      return 1;

    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;
  }
  static String INTOPOS(String str)
  {
    StringBuilder res=new StringBuilder();
    Stack<Character> stack=new Stack<>();
    for(char e:str.toCharArray())
    {
      if(Character.isLetterOrDigit(e))
      {
        res.append(e);
      }
      else if(e=='(')
      {
        stack.push(e);
      }
      else if(e==')')
      {
        while(!stack.isEmpty()&&stack.peek()!='(')
        {
          res.append(stack.pop());
        }
        stack.pop();
      }
      else{
      while (!stack.isEmpty() && Prec(e) <= Prec(stack.peek())) {// While top of 'operator' has greater precedence example: if stack= '+' and c='*', then we pop '+' and push '*' in stack. 
          res.append(stack.pop()); 
        }
        stack.push(e);
      }

      }  
      while (!stack.isEmpty()) {
              if (stack.peek() == '(')
                return "Invalid Expression";
                res.append(stack.pop()); 
            }

return res.toString();
  }
  public static void main(String[] args) {
    String str="(P+Q)*(M-N)";
    System.out.println("INFIX EXPRESSIONS::"+str);
    System.out.println("POSTFIX EXPRESSION::"+ INTOPOS(str));
  }
}