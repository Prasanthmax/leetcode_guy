// Last updated: 14/07/2026, 14:43:22
class Solution {
    public int minChanges(String s) {
        int k=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                k++;
            }
        }
        return k;
    }
}