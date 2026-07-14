// Last updated: 14/07/2026, 14:46:44
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,right=0,count=0;
        int prod=1;
        if(k<=1) return 0;
        for(right=0;right<nums.length;right++){
            prod*=nums[right];
            while(prod>=k){
                prod/=nums[left++];
            }
            count+=(right-left+1);
        }
         return count;
    }
}