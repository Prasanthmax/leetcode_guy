// Last updated: 14/07/2026, 14:48:32
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int s=0;
        int t=nums.length-1;
        while(t>s){
            int temp=nums[s];
            nums[s]=nums[t];
            nums[t]=temp;
            s++;
            t--;
        }
        s=0;
        t=k-1;
        while(s<t){
            int temp=nums[s];
            nums[s]=nums[t];
            nums[t]=temp;
            s++;
            t--;
        }
        s=k;
        t=nums.length-1;
        while(s<t){
            int temp=nums[s];
            nums[s]=nums[t];
            nums[t]=temp;
            s++;
            t--;
        }
    }
}