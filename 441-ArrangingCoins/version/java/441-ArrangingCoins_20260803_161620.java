// Last updated: 03/08/2026, 16:16:20
1class Solution {
2    public int arrangeCoins(int n) {
3        return (int)(Math.sqrt(8.0*(long)n+1)-1)/2;
4    }
5}