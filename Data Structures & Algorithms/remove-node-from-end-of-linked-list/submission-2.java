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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        int count= 0;
        ListNode currNode = head;
        ListNode next;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        } 
        if(n==size){
            return head.next; 
        }
        currNode = head;
        while(count != size-n-1){
            currNode = currNode.next;
            count++;
        }
        currNode.next = currNode.next.next;
        return head;
    }
}
