import java.util.Stack;

/* 
LeetCode 20: Valid Patentheses
https://leetcode.com/problems/valid-parentheses/

Time Complexity: O(n)
Space Complexity: O(n)

Note: While copying the code please write your own main method.
*/

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