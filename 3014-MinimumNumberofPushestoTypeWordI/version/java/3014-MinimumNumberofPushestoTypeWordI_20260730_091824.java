// Last updated: 30/07/2026, 09:18:24
1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int count=0;
5        for(int i=0;i<n;i++){
6            if(i<=7){
7                count++;
8            }
9            if(i>7 && i<=15){
10                count+=2;
11            }
12            if(i>15 && i<=23){
13                count+=3;
14            }
15            if(i>23){
16                count+=4;
17            }
18        }
19        return count;
20    }
21}