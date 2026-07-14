// Last updated: 14/07/2026, 14:42:56
class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                a+=nums[i];
            }
            else{
                b+=nums[i];
            }
        }
        return (a>b) || (b>a);
    }
}