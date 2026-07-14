// Last updated: 14/07/2026, 14:49:38
class Solution {
    public int climbStairs(int n) {
        int a=0,b=1,c=0;
        if(n==0) return a;
        if(n==1) return b;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}