// Last updated: 14/07/2026, 14:50:38
class Solution {
    public boolean isPalindrome(int x) {
       int temp=0,original=x;
       if(x<0) return false;
       while(x!=0){
        int digit=x%10;
        temp=temp*10+digit;
        x/=10;
       }
       return temp==original;
    }
}