// Last updated: 14/07/2026, 14:42:43
class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int k=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE;
            int max=0;
            int num=nums[i];
            while(num!=0){
                int temp=num%10;
                min=Math.min(temp,min);
                max=Math.max(temp,max);
                num/=10;
            }
            arr[k]=max-min;
            k++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(max==arr[i]){
                sum+=nums[i];
            }
        }
        return sum;
    }
}