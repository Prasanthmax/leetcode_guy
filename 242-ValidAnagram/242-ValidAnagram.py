# Last updated: 14/07/2026, 14:48:03
class Solution(object):  
    def isAnagram(self, s, t):    
        self.s=s
        self.t=t
        a = sorted(s.replace(" ", ""))    
        b = sorted(t.replace(" ", ""))  
        return a == b  