// Last updated: 14/07/2026, 14:45:25
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i<j && nums[i]==nums[j]){
                    num++;
                }
            }
        }
        return num;
    }
}