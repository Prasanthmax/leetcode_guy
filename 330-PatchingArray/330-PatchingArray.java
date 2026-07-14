// Last updated: 14/07/2026, 14:47:42
class Solution {
    public int minPatches(int[] nums, int n) {
        long miss=1;
        int sum=0;
        int j=0;
        while(miss<=n){
            if(j<nums.length && nums[j]<=miss){
                miss+=nums[j];
                j++;
            }
            else{
                sum++;
                miss+=miss;
            }
        }
        return sum;
    }
}