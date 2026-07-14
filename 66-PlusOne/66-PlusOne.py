# Last updated: 14/07/2026, 14:49:47
class Solution(object):
    def plusOne(self, digits):
       for i in range(len(digits)-1,-1,-1):
        if digits[i]<9:
            digits[i]=digits[i]+1
            return digits
        digits[i]=0
       arr=[0]*(len(digits)+1)
       arr[0]=1
       return arr