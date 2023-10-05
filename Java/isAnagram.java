/* 
LeetCode 242:  isAnagram
https://leetcode.com/problems/valid-anagram/

Time Complexity: O(n)
Space Complexity: O(1)

Note: While copying the code please write your own main method.

Runtime:5ms
Beats 54.38%of users with Java
Memory:41.76MB
Beats 90.66%of users with Java
*/

class isAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int alphabet[] = new int[26];

        for(int i=0;i<s.length();i++)
        {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for(int i:alphabet)
        {
            if(i!=0)
                return false;
        }
        return true;
    }
}