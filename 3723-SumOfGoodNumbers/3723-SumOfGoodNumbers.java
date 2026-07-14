// Last updated: 14/07/2026, 14:42:52
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int sum=0;
        for(int i = 0 ;i<nums.length ; i++){
            
            if(i>=k && i<n-k && nums[i]>nums[i+k] && nums[i]>nums[i-k] ){
                sum+=nums[i];
            }
            else if(i>=n-k  && nums[i]>nums[i-k]){
                sum+=nums[i];
            }
            else if(i<k  && nums[i]>nums[i+k]){
                sum+=nums[i];
            }
        }
        return sum;
        
    }
}