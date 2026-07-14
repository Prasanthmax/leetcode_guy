// Last updated: 14/07/2026, 14:50:46
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode();
        ListNode prev=temp;
        int carry=0;
        int sum;
        while(l1!=null || l2!=null || carry!=0){
            int val1=0,val2=0;
            if(l1!=null){
                val1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                val2=l2.val;
                l2=l2.next;
            }
            sum=val1+val2+carry;
            carry=sum/10;
            prev.next = new ListNode(sum%10);
            prev=prev.next; 
        }
        return temp.next;
    }
}