// Last updated: 14/07/2026, 14:47:05
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }
            if(nums[i]==0 || i==nums.length-1){
                count=Math.max(count,temp);
                temp=0;
            }
        }
        return count;
    }
}