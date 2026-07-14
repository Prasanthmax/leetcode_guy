// Last updated: 14/07/2026, 14:46:15
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                arr[pos--]=leftsq;
                left++;
            }
            else{
                arr[pos--]=rightsq;
                right--;
            }
        }
        return arr;
    }
}