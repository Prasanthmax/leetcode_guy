// Last updated: 03/08/2026, 16:32:27
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int temp=nums[0];
4        int ind=0;
5        for(int i=1;i<nums.length;i++){
6            if(temp<nums[i]){
7                temp=nums[i];
8                ind=i;
9            }
10        }
11        return ind;
12    }
13}