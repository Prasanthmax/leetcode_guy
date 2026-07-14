# Last updated: 14/07/2026, 14:50:10
class Solution(object):
    def searchInsert(self, nums, target):
       for i in range(len(nums)-1,-1,-1):
        if(nums[i]==target):
            return i
        if(target>nums[i]):
            return i+1
       return 0
        