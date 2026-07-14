// Last updated: 14/07/2026, 14:49:00
class Solution {
    public int singleNumber(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp^=nums[i];
        }
        return temp;
    }
}