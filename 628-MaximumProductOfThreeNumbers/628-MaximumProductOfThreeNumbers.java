// Last updated: 14/07/2026, 14:46:53
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=0;
            int m1=nums[0]*nums[1]*nums[n-1];
            int m2=nums[n-1]*nums[n-2]*nums[n-3];
            max=Math.max(m1,m2);
        return max;
    }
}