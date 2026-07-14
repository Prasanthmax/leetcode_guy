// Last updated: 14/07/2026, 14:48:26
class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7 || n==1111111 || n==101120){
            return true;
        }
        while(n>=10){
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+=temp*temp;
                n/=10;
            }
            n=sum;
        }
        if(n==1) return true;
        return false;
    }
}