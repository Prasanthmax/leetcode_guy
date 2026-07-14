# Last updated: 14/07/2026, 14:46:25
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def middleNode(self, head):
        t1=head
        t2=head
        while(t2!=None and t2.next!=None):
            t1=t1.next
            t2=t2.next.next
        return t1
        