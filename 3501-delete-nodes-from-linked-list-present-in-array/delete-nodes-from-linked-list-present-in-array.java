import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        
        // Create a dummy node that points to the head of the list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;
        
        while (temp != null) {
            if (hs.contains(temp.val)) {
                // Skip the current node
                prev.next = temp.next;
            } else {
                // Move prev pointer only if the current node is not removed
                prev = temp;
            }
            temp = temp.next;
        }
        
        // Return the next node of dummy which is the new head of the list
        return dummy.next;
    }
}
