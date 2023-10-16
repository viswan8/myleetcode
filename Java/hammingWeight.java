/* 
LeetCode 191. No of 1 Bits

https://leetcode.com/problems/number-of-1-bits/

Time Complexity: O(1)
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/

// Normal Way
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        int mask = 1;
        for(int i=0;i<32;i++)
        {
            if((n&mask)!=0)
                count++;
            n >>= 1;
        }
        return count;
    }
}

//smartway
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0)
        {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}