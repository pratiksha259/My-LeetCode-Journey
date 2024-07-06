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
        ListNode mid;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        

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

         ListNode r=prev;
         ListNode l=head;
         ListNode nextl;
         ListNode nextr;
         while(l!=null && r!=null)
         {
           nextl=l.next;
           l.next=r;
           nextr=r.next;
           r.next=nextl;
           
           l=nextl;
           r=nextr;
         }
         return;

        
    }
}