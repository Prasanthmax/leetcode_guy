// Last updated: 14/07/2026, 14:49:33
class Solution {
    public int removeDuplicates(int[] nums) {
        int p=2;
        if(nums.length<=2){
            return nums.length;
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[p-2]){
                nums[p]=nums[i];
                p++;
            }
        }
        return p;
    }
}