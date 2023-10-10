/* 
LeetCode 121. Best Time to Buy and Sell Stock

https://leetcode.com/problems/best-time-to-buy-and-sell-stock

Time Complexity: O(n)
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                max = Math.max(max, prices[r] - prices[l]);
                r++;
            }
            else
            {
                l = r;
                r++; 
            }
        }
        return max;
    }
}

//This kind of problem solving is called sliding window.