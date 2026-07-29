// Last updated: 29/07/2026, 12:02:23
1class Solution {
2    public int minMoves(int[] nums) {
3        Arrays.sort(nums);
4        int temp=nums[0];
5        int sum=0;
6        for(int i=1;i<nums.length;i++){
7            sum+=nums[i]-temp;
8        }
9        return sum;
10    }
11}