// Last updated: 14/07/2026, 14:45:46
class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int prefix=0;
        for(int num:nums){
            sum+=num;
            prefix=Math.min(prefix,sum);
        }
        return 1-prefix;
    }
}