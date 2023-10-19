/* 
LeetCode 66. Plus One

https://leetcode.com/problems/plus-one/

Time Complexity: O(n) 
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/

class Solution {

    public int[] plusOne(int[] digits) {
        final int len = digits.length;
        int[] newDigits = new int[len + 1];
        int carry = 1;
        int currSum = 0;
        for (int i = len - 1; i >= 0; i--) 
        {
            currSum = digits[i] + carry;
            if (currSum > 9) 
            {
                digits[i] = currSum % 10;
                newDigits[i + 1] = digits[i];
                carry = 1;
            } 
            else 
            {
                digits[i] = currSum;
                newDigits[i + 1] = digits[i];
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }
}
