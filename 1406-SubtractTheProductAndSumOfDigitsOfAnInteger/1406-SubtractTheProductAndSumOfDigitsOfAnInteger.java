// Last updated: 14/07/2026, 14:46:01
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            pro*=temp;
            n/=10;
        }    
        int diff=pro-sum;
        return diff;
    }
}