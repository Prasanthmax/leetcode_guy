// Last updated: 14/07/2026, 14:47:19
class Solution {
    public int countSegments(String s) {
        int sum=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isWhitespace(ch)){
                if(i==0 || Character.isWhitespace(s.charAt(i-1))){
                    sum++;
                }
            }
        }
        return sum;
    }
}