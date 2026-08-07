// Last updated: 07/08/2026, 20:15:07
1class Solution {
2    public String winningPlayer(int x, int y) {
3        int min=0;
4        min=Math.min(x,y/4);
5        return min%2!=0 ? "Alice" : "Bob";
6    }
7}