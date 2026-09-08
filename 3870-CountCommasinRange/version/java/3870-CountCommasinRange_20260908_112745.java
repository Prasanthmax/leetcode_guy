// Last updated: 08/09/2026, 11:27:45
1class Solution {
2    public int countCommas(int n) {
3        int res=0;
4        int count=0;
5        int temp=n;
6        while(temp!=0){
7            count++;
8            temp/=10;
9        }
10        if(count>3){
11            for(int i=1000;i<=n;i++){
12                res++;
13            }
14        }
15        return res;
16    }
17}