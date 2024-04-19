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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        //reverse
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode lh=head;
        ListNode rh=prev;
        //alt merge
        ListNode nextl;
        ListNode nextr;
        while(lh!=null&&rh!=null)
        {
            nextl=lh.next;
            lh.next=rh;
            nextr=rh.next;
            rh.next=nextl;
            //update
            lh=nextl;
            rh=nextr;

           

        }
    }
}