// Last updated: 14/07/2026, 14:48:20
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode x=temp.next;
            temp.next=prev;
            prev=temp;
            temp=x;
        }
        return prev;
    }
}