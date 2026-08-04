// Last updated: 04/08/2026, 11:47:56
1class Solution {
2    public int reverseDegree(String s) {
3        Map<Character,Integer> map=new HashMap<>();
4        char c='z';
5        for(int i=1;i<=26;i++){
6            map.put(c--,i);
7        }
8        int sum=0;
9        for(int i=0;i<s.length();i++){
10            sum+=map.get(s.charAt(i))*(i+1);
11        }
12        return sum;
13    }
14}