// Last updated: 07/10/2026, 23:47:27
1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
4        int inter=1;
5        int temp=points[0][1];
6        for(int i=1;i<points.length;i++){
7            if(points[i][0]<=temp){
8                continue;
9            }
10            inter++;
11            temp=points[i][1];
12        }
13        return inter;
14    }
15}