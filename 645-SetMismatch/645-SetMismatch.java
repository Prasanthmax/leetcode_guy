// Last updated: 14/07/2026, 14:46:52
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[2];
        int missing=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                arr[0]=nums[i];
            }
            if(nums[i]-nums[i-1]>1){
                missing=nums[i-1]+1;
            }
        }
        if(nums[nums.length-1]!=nums.length){
            missing=nums.length;
        }
        arr[1]=missing;
        return arr;
    }
}