/* 
LeetCode 42. Trapping Rain Water

https://leetcode.com/problems/trapping-rain-water/

Time Complexity: O(n) since 3 individual loops running till n
Space Complexity: O(n) since 2 arrays of size n are created

Note: While copying the code please write your own main method.
*/

class Solution {
    public int trappedRainWater(int[] height) {
        //calculate left max boundary
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater =0;
        //loop
        for(int i=0;i<n;i++)
        {
            //waterlevel = min(left max , right max)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

             //trapped water = waterlevel - height
            trappedWater += waterLevel - height[i];
        }
        
       return trappedWater;
    }
}