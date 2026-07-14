# Last updated: 14/07/2026, 14:48:40
class Solution(object):
    def findMin(self, nums):
       temp=nums[0]
       for i in range(len(nums)):
        if(nums[i]<temp):
            temp=nums[i]
       return temp
        