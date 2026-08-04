// Last updated: 04/08/2026, 10:59:15
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int sum1=0;
4        int sum2=0;
5        for(int i=1;i<=n;i++){
6            if(i%m!=0){
7                sum1+=i;
8            }
9        }
10        for(int i=1;i<=n;i++){
11            if(i%m==0){
12                sum2+=i;
13            }
14        }
15        return sum1-sum2;
16    }
17}