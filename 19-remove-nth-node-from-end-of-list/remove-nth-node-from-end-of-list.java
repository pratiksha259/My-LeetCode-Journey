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
        ListNode curr=head;
        int s=0;
        while(curr!=null)
        {
             s++;
            curr=curr.next;
           
        }
        if(s==n)
        {
            head=head.next;
            return head;
        }
        int i=1;
        ListNode prev=head;
        while(i<(s-n))
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;

        
        
    }
}