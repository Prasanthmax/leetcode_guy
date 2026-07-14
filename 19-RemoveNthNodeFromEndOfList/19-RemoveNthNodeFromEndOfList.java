// Last updated: 14/07/2026, 14:50:28
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
        ListNode temp=head,curr=head;
        int l=1;
        while(temp.next!=null){
            l++;
            temp=temp.next;
        }
        for(int i=0;i<l-n-1;i++){
            curr=curr.next;
        }
        if(l==n){
            return head.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
        return head;
    }
}