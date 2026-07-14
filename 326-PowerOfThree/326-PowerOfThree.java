// Last updated: 14/07/2026, 14:47:43
class Solution {
    public boolean isPowerOfThree(int x) {
       int temp=1;
       if(x==0){
        return false;
       }
       while(x!=1){
        if(x%3!=0){
            temp=2;
            break;
        }
        x=x/3;
       }
       
       if(temp==1){
        return true;
       }
       return false;
}
}