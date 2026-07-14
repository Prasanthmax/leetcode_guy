// Last updated: 14/07/2026, 14:44:16
class Solution {
    public int minimumDeletions(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int mid=nums.length/2;
        int minid=0,maxid=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxid=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minid=i;
            }
        }
        int left=Math.min(minid,maxid);
        int right=Math.max(minid,maxid);
        int leftpos=right+1;
        int rightpos=nums.length-left;
        int middle=(left+1)+(nums.length-right);
        return Math.min(leftpos,Math.min(rightpos,middle));
    }
}