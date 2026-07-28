// Last updated: 28/07/2026, 16:28:26
class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        boolean res=false;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if((i==0) && (Character.isUpperCase(c))){
                res=true;
            }
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        if(count==word.length() || count==0 || (res && count==1)){
            return true;
        }
        return false;
    }
}