/* 
LeetCode 202. Happy Number

https://leetcode.com/problems/happy-number/

Time Complexity: O(nlogn) 
Space Complexity: O(n) 
Note: While copying the code please write your own main method.
*/

class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==-1)
            return true;
        HashSet<Integer> visit = new HashSet<>();

        while(!visit.contains(n))
        {
            visit.add(n);
            n = sumOfSquare(n);

            if(n==1)
                return true;
        }

        return false;
    }

    public int sumOfSquare(int n){
        int output =0;
        while(n !=0)
        {
            int temp = n%10;
            temp = temp * temp;
            output += temp;
            n /= 10;
        }
        return output;
    }

}