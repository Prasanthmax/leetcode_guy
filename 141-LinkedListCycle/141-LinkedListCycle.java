// Last updated: 14/07/2026, 14:48:56
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}