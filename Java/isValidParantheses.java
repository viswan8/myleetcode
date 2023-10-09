import java.util.Stack;

class Solution {
    public boolean isValidParantheses(String s) {
        if(s.length()%2!=0)
        {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<=s.length()-1;i++)
        {
            if(stack.isEmpty() && (s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')'))
                return false;
            else
            {
                if(s.charAt(i)== ')' && stack.peek()=='(')
                {
                    stack.pop();
                }
                else if(s.charAt(i)== ']' && stack.peek()=='[')
                {
                    stack.pop();
                }
                else if(s.charAt(i)=='}' && stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
        }
        
        return stack.isEmpty();
        
    }
}