// Last updated: 03/08/2026, 14:17:28
class Solution {
    public long sumAndMultiply(int n) {
        long temp=0;
        int tmp=n;
        int sum=0;
        while(tmp>0){
            int digit=tmp%10;
            if(digit!=0){
                temp=temp*10+digit;
                sum+=digit;
            }
            tmp/=10;
        }
        long res=0;
        while(temp>0){
            res=res*10+(temp%10);
            temp/=10;
        }
        return sum*res;
    }
}