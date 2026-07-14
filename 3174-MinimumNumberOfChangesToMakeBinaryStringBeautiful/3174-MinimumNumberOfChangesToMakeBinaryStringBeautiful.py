# Last updated: 14/07/2026, 14:43:16
class Solution(object):
    def minChanges(self, s):
        res=0
        for i in range(0,len(s)-1,2):
            if(s[i]!=s[i+1]):
                res=res+1
        return res