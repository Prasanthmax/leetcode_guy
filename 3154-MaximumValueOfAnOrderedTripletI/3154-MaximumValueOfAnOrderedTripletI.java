// Last updated: 14/07/2026, 14:43:18
class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(i<j && j<k){
                        long temp=(long) (nums[i]-nums[j])*nums[k];
                        max=Math.max(max,temp);
                    }
                }
            }
        }
        return max;
    }
}