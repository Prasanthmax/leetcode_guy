# Last updated: 14/07/2026, 14:50:24
class Solution(object):
    def removeElement(self, nums, val):
       k=0
       for i in range(len(nums)):
        if(nums[i]!=val):
            nums[k]=nums[i]
            k=k+1
       return k
        