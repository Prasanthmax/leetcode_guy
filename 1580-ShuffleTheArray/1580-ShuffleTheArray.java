// Last updated: 14/07/2026, 14:45:43
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int t=0;
        for(int i=0;i<n;i++){
            arr[t]=nums[i];
            t+=2;
        }
        t=1;
        for(int i=n;i<nums.length;i++){
            arr[t]=nums[i];
            t+=2;
        }
        //arr[arr.length-1]=nums[nums.length-1];
        return arr;
    }
}