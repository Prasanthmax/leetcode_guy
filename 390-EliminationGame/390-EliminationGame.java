// Last updated: 14/07/2026, 14:47:26
class Solution {
    public int lastRemaining(int n) {
        if (n==1) return 1;
        return 2*(n/2+1-lastRemaining(n/2));
    }
}