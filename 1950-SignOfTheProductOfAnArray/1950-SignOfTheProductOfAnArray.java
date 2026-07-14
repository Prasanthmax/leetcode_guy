// Last updated: 14/07/2026, 14:44:40
class Solution {
    public int arraySign(int[] nums) {
        int sum=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                nums[i]=-1;
            }
            if(nums[i]>0){
                nums[i]=1;
            }
        }
        for(int i=0;i<nums.length;i++){
            sum*=nums[i];
        }
        return sum;
    }
}