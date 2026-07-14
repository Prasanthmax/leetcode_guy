// Last updated: 14/07/2026, 14:44:22
class Solution {
    public int findMiddleIndex(int[] nums) {
        int total=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<nums.length;i++){
            if(total==sum-total-nums[i]) return i;
            total+=nums[i];
        }
        return -1;
    }
}