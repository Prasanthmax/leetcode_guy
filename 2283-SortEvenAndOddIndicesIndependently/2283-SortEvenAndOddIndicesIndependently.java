// Last updated: 14/07/2026, 14:44:06
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] arr1=new int[nums.length/2];
        int[] arr2=new int[nums.length-arr1.length];
        int a=0,b=0;
        for(int i=1;i<nums.length;i+=2){
            arr1[a]=nums[i];
            a++;
        }
        for(int i=0;i<nums.length;i+=2){
            arr2[b]=nums[i];
            b++;
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=-arr1[i];
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=-arr1[i];
        }
        int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=arr2[c];
                c++;
            }
            if(i%2!=0){
                nums[i]=arr1[d];
                d++;
            }
        }
        return nums;
    }
}