// Last updated: 07/08/2026, 14:03:35
1class Solution {
2    public int eliminateMaximum(int[] dist, int[] speed) {
3        int count=0;
4        int[] arr=new int[dist.length];
5        for(int i=0;i<dist.length;i++){
6            arr[i]=(dist[i]-1)/speed[i];
7        }
8        Arrays.sort(arr);
9        for(int i=0;i<dist.length;i++){
10            if(arr[i]<i){
11                return i;
12            }
13        }
14        return dist.length;
15    }
16}