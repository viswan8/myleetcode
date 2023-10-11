/* 
LeetCode 704: Binary Search
https://leetcode.com/problems/binary-search/description/

Time Complexity: O(log(n))
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/


class Solution {
    public int binSearch(int[] nums, int target) {
        int start = 0;
        int last = nums.length-1;        
        while(start <= last)
        {
            int mid = (start + last)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                start = mid +1;
            }
            else
            {
               last = mid-1;
            }
        }
        return -1;
    }
}