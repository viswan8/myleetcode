/* 
LeetCode 217: Contains Duplicates
https://leetcode.com/problems/contains-duplicate/

Time Complexity: O(n)
Space Complexity: O(n)

Note: While copying the code please write your own main method.
*/

class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> Unique = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(Unique.contains(nums[i]))
            {
                return true;
            }
            Unique.add(nums[i]);
        }
        return false;
    }
}