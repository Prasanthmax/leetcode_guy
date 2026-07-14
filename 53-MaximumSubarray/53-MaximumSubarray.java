// Last updated: 14/07/2026, 14:49:54
class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=nums[0];
        int maxsofar=nums[0];
        for(int i=1;i<nums.length;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsofar=Math.max(maxsofar,currsum);
        }
        return maxsofar;
    }
}