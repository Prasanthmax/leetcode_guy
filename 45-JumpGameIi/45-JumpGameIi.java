// Last updated: 14/07/2026, 14:49:59
class Solution {
    public int jump(int[] nums) {
        int max=0;
        int min=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i]+i);
            if(min==i){
                count++;
                min=max;
            } 
        }
        return count;
    }
}