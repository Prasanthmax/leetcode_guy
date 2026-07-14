// Last updated: 14/07/2026, 14:43:53
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sub=0;
        int trigger=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                trigger+=1;
                sub+=trigger;
            }
            else{
                trigger=0;
            }
        }
        return sub;
    }
}