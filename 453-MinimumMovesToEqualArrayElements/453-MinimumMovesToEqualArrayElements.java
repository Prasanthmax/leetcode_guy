// Last updated: 03/08/2026, 14:23:15
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int temp=nums[0];
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i]-temp;
        }
        return sum;
    }
}