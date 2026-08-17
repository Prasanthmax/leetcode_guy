// Last updated: 17/08/2026, 12:23:12
1class Solution {
2    public int maxDistToClosest(int[] seats) {
3        int lead=0;
4        int trail=0;
5        int max=0;
6        for(int i=0;i<seats.length;i++){
7            if(seats[i]==1){
8                break;
9            }
10            lead++;
11        }
12        for(int i=seats.length-1;i>=0;i--){
13            if(seats[i]==1){
14                break;
15            }
16            trail++;
17        }
18        int j=0;
19        for(int i=0;i<seats.length;i++){
20            if(seats[i]==1){
21                max=Math.max(max,Math.abs(i-j)/2);
22                j=i;
23            }
24        }
25        return Math.max(max,Math.max(trail,lead));
26    }
27}