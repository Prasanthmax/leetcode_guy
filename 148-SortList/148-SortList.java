// Last updated: 14/07/2026, 14:48:48
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
    public ListNode sortList(ListNode head) {
        ListNode temp=head,curr=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=curr.val;
            curr=curr.next;
        }
        Arrays.sort(arr);
        curr=head;
        for(int i=0;i<n;i++){
            curr.val=arr[i];
            curr=curr.next;
        }
        return head;
    }
}