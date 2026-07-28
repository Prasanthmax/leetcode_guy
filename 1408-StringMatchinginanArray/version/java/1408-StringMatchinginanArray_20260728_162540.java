// Last updated: 28/07/2026, 16:25:40
1class Solution {
2    public int maxPower(String s) {
3        int max=0;
4        int count=1;
5        for(int i=0;i<s.length()-1;i++){
6            if(s.charAt(i)==s.charAt(i+1)){
7                count++;
8            }
9            else{
10                max=Math.max(max,count);
11                count=1;
12            }
13        }
14        max=Math.max(max,count);
15        return max;
16    }
17}