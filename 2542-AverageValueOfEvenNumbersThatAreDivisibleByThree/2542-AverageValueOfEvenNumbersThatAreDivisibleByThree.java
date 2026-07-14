// Last updated: 14/07/2026, 14:43:45
class Solution {
    public int averageValue(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                System.out.print(nums[i]+" ");
                a+=nums[i];
                b++;
            }
        }
        if(b==0) return 0;
        int avg=a/b;
        return avg;
    }
}