// Last updated: 14/07/2026, 14:47:11
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss=s+s;
        String sss=ss.substring(1,ss.length()-1);
        if(sss.contains(s)){
            return true;
        }
        return false;
    }
}