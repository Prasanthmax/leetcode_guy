// Last updated: 12/08/2026, 22:06:20
1class Solution {
2    public int heightChecker(int[] heights) {
3        int count=0;
4        int[] arr=Arrays.copyOf(heights,heights.length);
5        Arrays.sort(arr);
6        for(int i=0;i<arr.length;i++){
7            if(arr[i]!=heights[i]){
8                count++;
9            }
10        }
11        return count;
12    }
13}