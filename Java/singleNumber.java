/* 
LeetCode 136:  Single Number

https://leetcode.com/problems/single-number/

Time Complexity: O(n)
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/

class Solution {
    public int singleNumber(int[] nums) {
        int first = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            first ^= nums[i];
        }
        return first;
    }
}