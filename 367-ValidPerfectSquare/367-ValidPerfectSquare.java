// Last updated: 14/07/2026, 14:47:34
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        for(int i=1;i<num;i++){
            long temp=i*i;
            if(temp==num){
                return true;
            }
            if(temp>num){
                break;
            }
        }
        return false;
    }
}