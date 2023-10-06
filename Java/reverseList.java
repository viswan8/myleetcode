/* 
LeetCode 206: Reverse of LinkedList
https://leetcode.com/problems/reverse-linked-list

Time Complexity: O(n)
Space Complexity: O(1)

Note: While copying the code please write your own main method.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Iterative Method
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode !=null)
        {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            
            //update
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }
}