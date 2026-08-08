// Last updated: 08/08/2026, 14:45:22
1class Solution {
2    public int findClosestNumber(int[] nums) {
3        Arrays.sort(nums);
4        int min=nums[0];
5        for(int i=1;i<nums.length;i++){
6            if(Math.abs(min)>=Math.abs(nums[i])){
7                min=nums[i];
8            }
9        }
10        return min;
11    }
12}