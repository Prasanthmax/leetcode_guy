// Last updated: 14/07/2026, 14:43:42
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0) return n/2;
        if(n==1) return 0;
        return n;
    }
}