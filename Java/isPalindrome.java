/* 
LeetCode 215:  Valid Palindrome
https://leetcode.com/problems/valid-palindrome

Time Complexity: O(n)
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}