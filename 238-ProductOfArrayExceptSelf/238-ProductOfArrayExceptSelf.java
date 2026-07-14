// Last updated: 14/07/2026, 14:48:01
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=prefix;
            prefix*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[i]*=suffix;
            suffix*=nums[i];
        }
        return arr;
    }
}