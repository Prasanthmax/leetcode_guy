// Last updated: 14/07/2026, 14:50:26
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer=new ListNode();
        ListNode temp=answer;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                temp.next=new ListNode(l2.val);
                l2=l2.next;
            }
            temp=temp.next;

        }
        if(l1!=null) temp.next=l1;
        if(l2!=null) temp.next=l2;
        return answer.next;
    }
}