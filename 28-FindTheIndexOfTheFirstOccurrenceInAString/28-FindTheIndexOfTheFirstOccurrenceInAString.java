// Last updated: 14/07/2026, 14:50:18
class Solution {
    public int strStr(String haystack, String needle) {
         int n=haystack.length();
         int k=needle.length();
         int stop=n-k;
         for(int i=0;i<=stop;i++){
            if(needle.equals(haystack.substring(i,k+i))){
                return i;
            }
         }
         return -1;
    }
}