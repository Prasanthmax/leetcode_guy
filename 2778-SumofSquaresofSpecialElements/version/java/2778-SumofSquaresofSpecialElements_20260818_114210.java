// Last updated: 18/08/2026, 11:42:10
1class Solution {
2    public int maxVowels(String s, int k) {
3        int count=0;
4        int right=0,left=0;
5        String a="aeiou";
6        int temp=0;
7        while(right<s.length()){
8            if(a.indexOf(s.charAt(right))!=-1){
9                temp++;
10            }
11            if(k==right-left){
12                if(a.indexOf(s.charAt(left))!=-1){
13                    temp--;
14                }
15                left++;
16            }
17            count=Math.max(count,temp);
18            right++;
19        }
20        return count;
21    }
22}