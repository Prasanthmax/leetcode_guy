// Last updated: 03/08/2026, 14:17:41
class Solution {
    public int maxProduct(int n) {
        if(n==0) return 0;
        int fmax=0;
        int smax=0;
        while(n!=0){
            int temp=n%10;
            if(temp>fmax){
                smax=fmax;
                fmax=temp;
            }
            else if(temp>smax){
                smax=temp;
            }
            n/=10;
        }
        return fmax*smax;
    }
}