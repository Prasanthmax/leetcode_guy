// Last updated: 14/07/2026, 14:43:13
class Solution {
    public int countTestedDevices(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                count++;
                for(int j=i+1;j<arr.length;j++){
                    arr[j]=Math.max(0,arr[j]-1);
                }
            }
            else{
                continue;
            }
        }
        return count;
    }
}