// Last updated: 14/07/2026, 14:50:15
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target) return i;
            if(target>nums[i]) return i+1;
        }
        return 0;
    }
}