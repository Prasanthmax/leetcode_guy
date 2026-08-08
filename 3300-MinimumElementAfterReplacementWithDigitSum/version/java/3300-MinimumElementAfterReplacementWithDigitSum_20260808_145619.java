// Last updated: 08/08/2026, 14:56:19
1class Solution {
2    public int minElement(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            int temp=0;
6            while(nums[i]!=0){
7                int res=nums[i]%10;
8                temp+=res;
9                nums[i]/=10;
10            }
11            min=Math.min(min,temp);
12        }
13        return min;
14    }
15}