// Last updated: 30/07/2026, 10:04:04
1class Solution {
2    public long sumAndMultiply(int n) {
3        long temp=0;
4        int tmp=n;
5        int sum=0;
6        while(tmp>0){
7            int digit=tmp%10;
8            if(digit!=0){
9                temp=temp*10+digit;
10                sum+=digit;
11            }
12            tmp/=10;
13        }
14        long res=0;
15        while(temp>0){
16            res=res*10+(temp%10);
17            temp/=10;
18        }
19        return sum*res;
20    }
21}