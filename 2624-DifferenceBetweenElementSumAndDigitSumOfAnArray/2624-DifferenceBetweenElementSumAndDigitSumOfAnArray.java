// Last updated: 14/07/2026, 14:43:38
class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int temp=0;
                while(nums[i]!=0){
                    temp+=nums[i]%10;
                    nums[i]/=10;
                }
                dsum+=temp;
            }
            else{
                dsum+=nums[i];
            }
        }
        return esum-dsum;
    }
}