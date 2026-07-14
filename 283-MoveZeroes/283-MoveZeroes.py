# Last updated: 14/07/2026, 14:47:57
class Solution(object):
    def moveZeroes(self, nums):
        self.nums=nums
        temp=0
        for num in nums:
            if num==0:
                temp+=1
        nums[:]=[num for num in nums if num!=0]
        nums.extend([0]*temp)