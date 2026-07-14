// Last updated: 14/07/2026, 14:48:45
class Solution {
    public int findMin(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<temp){
                temp=nums[i];
            }
        }
        return temp;
    }
}