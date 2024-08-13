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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode curr=head;
        int l=1;
        if(head==null)
         return head;
        if(k==0)
         return head;
        while(curr.next!=null)
        {
            curr=curr.next;
            l++;
        }
        curr.next=head;
        k=k%l;
        l=l-k;
        int c=1;
        while(c<l)
        {
          temp=temp.next;
          c++;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}