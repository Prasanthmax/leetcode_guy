// Last updated: 18/08/2026, 10:58:30
1class Solution {
2    public int countAsterisks(String s) {
3        int seen=0;
4        int count=0;
5        for(char c:s.toCharArray()){
6            if(c=='|'){
7                seen++;
8            }
9            if(seen%2==0 && c=='*'){
10                count++;
11            }
12        }
13        return count;
14    }
15}