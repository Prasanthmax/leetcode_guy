// Last updated: 30/07/2026, 09:34:27
1class Solution {
2    public int maxProduct(int n) {
3        if(n==0) return 0;
4        int fmax=0;
5        int smax=0;
6        while(n!=0){
7            int temp=n%10;
8            if(temp>fmax){
9                smax=fmax;
10                fmax=temp;
11            }
12            else if(temp>smax){
13                smax=temp;
14            }
15            n/=10;
16        }
17        return fmax*smax;
18    }
19}