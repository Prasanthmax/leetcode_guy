// Last updated: 14/07/2026, 14:43:10
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int n:nums){
            arr[n]++;
        }
        int max=0;
        for(int a:arr){
            max=Math.max(max,a);
        }
        int res=0;
        for(int a:arr){
            if(a==max){
                res+=a;
            }
        }
        return res;
    }
}