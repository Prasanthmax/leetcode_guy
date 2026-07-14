// Last updated: 14/07/2026, 14:48:17
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int size=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                int curr=i-left+1;
                size=Math.min(size,curr);
                sum-=nums[left];
                left++;
            }
        }
        if(size==Integer.MAX_VALUE){
            return 0;
        }
        return size;
    }
}