// Last updated: 14/07/2026, 14:48:07
class Solution {
    public boolean isPowerOfTwo(int x) {
       int temp=1;
       if(x==0){
        return false;
       }
       while(x!=1){
        if(x%2!=0){
            temp=2;
            break;
        }
        x=x/2;
       }
       
       if(temp==1){
        return true;
       }
       return false;
}
}