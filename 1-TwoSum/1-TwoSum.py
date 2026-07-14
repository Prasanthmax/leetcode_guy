# Last updated: 14/07/2026, 14:50:49
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
       num_dict={}
       for i,val in enumerate(nums):
        com=target-val
        if com in num_dict:
            return [num_dict[com],i]
        num_dict[val]=i