// Last updated: 14/07/2026, 14:43:09
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        // boolean zero=false;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         String s=Integer.toString(nums[i]|nums[j]);
        //         if(s.charAt(s.length()-1)=='0'){
        //             zero=true;
        //             break;
        //         }
        //     }
        // }
        // return zero;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                n++;
            }
        }
        if(n>1){
            return true;
        }
        return false;
    }
}