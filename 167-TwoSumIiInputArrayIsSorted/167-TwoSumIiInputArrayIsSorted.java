// Last updated: 14/07/2026, 14:48:38
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int right=numbers.length-1;
        int left=0;
        while(left<=right){
            if(numbers[left]+numbers[right]==target){
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            else if(numbers[right]+numbers[left]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
}