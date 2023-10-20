/* 
LeetCode 338. Counting Bits

https://leetcode.com/problems/counting-bits/

Time Complexity: O(n) 
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/

class Solution {

    //TC: O(nlogn)
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
      for(int i =1;i<=n;i++){
            int temp = i;
            int count = 0 ;
            while(temp != 0){ 
                temp = temp & (temp-1);
                count++;
            }
            arr[i] = count;
        }
        

        return arr;
    }
}

class Solution {

    //TC: O(n)
    public int[] countBits(int n) {
        int res[] = new int[n+1];
        for(int i=1;i<n+1;i++)
        {
            res[i] = 1 + res[i & (i-1)];
        }
        return res;
    }
}