// Last updated: 14/07/2026, 14:43:15
class Solution {
    public int minimumSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        int temp=nums[i]+nums[j]+nums[k];
                        min=Math.min(temp,min);
                    }
                }
            }
        }
        if(min==2147483647) return -1;
        return min;
    }
}