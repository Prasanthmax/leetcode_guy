// Last updated: 14/07/2026, 14:46:47
class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toString(n,2);
        for(int i=1;i<s.length();i++){
            if((s.charAt(i)=='1' && s.charAt(i-1)=='0') || (s.charAt(i-1)=='1' && s.charAt(i)=='0')){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}