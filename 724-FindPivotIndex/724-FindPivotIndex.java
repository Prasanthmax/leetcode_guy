// Last updated: 14/07/2026, 14:46:49
class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            int right=prefix[nums.length-1]-prefix[i];
            int left=prefix[i]-nums[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}