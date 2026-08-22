// Last updated: 22/08/2026, 21:02:12
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int sum=0;
4        int temp=0;
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(c=='('){
8                sum++;
9            }
10            else{
11                sum--;
12            }
13            if(sum<0){
14                temp++;
15                sum=0;
16            }
17        }
18        return Math.abs(sum+temp);
19    }
20}