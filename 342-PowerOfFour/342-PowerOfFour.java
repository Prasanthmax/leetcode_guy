// Last updated: 14/07/2026, 14:47:38
class Solution {
    public boolean isPowerOfFour(int x) {
       int temp=1;
       if(x==0){
        return false;
       }
       while(x!=1){
        if(x%4!=0){
            temp=2;
            break;
        }
        x=x/4;
       }
       
       if(temp==1){
        return true;
       }
       return false;
}
}