// Last updated: 30/07/2026, 11:06:08
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.equals("abc")) return false;
4        String a=s+s;
5        return a.contains(goal);
6    }
7}