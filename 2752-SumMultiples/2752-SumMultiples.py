# Last updated: 14/07/2026, 14:43:26
class Solution(object):
    def sumOfMultiples(self, n):
      temp=0
      for i in range(1,n+1):
        if(i%3==0 or i%5==0 or i%7==0):
               temp+=i
      return temp
        