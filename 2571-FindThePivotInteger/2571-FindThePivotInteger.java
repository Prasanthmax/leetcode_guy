// Last updated: 14/07/2026, 14:43:44
class Solution {
    public int pivotInteger(int n) {
        if(n<=1) return n;
        int total=n*(n+1)/2;
        int left=0;
        for(int i=1;i<n;i++){
            if(left==total-left-i){
                return i;
            }
            left+=i;
        }
        return -1;
    }
}