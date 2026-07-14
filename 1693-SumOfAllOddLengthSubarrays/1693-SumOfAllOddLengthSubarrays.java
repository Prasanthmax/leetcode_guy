// Last updated: 14/07/2026, 14:45:15
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int odd=(n-i)*(i+1);
            int total=(odd+1)/2;
            count+=arr[i]*total;
        }
        return count;
    }
}