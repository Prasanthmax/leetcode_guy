// Last updated: 14/07/2026, 14:46:29
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode t1=head,t2=head;
        while(t2!=null && t2.next!=null){
            t1=t1.next;
            t2=t2.next.next;
        }
        return t1;
    }
}