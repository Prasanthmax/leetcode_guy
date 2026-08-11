// Last updated: 11/08/2026, 11:03:29
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean inc=true;
4        boolean dec=true;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]>nums[i+1]){
7                inc=false;
8                break;
9            }
10        }
11        for(int i=nums.length-1;i>0;i--){
12            if(nums[i]>nums[i-1]){
13                dec=false;
14                break;
15            }
16        }
17        return inc || dec;
18    }
19}