// Last updated: 14/07/2026, 14:49:03
class Solution {
    public int candy(int[] r) {
        int[] arr=new int[r.length];
        for(int i=0;i<r.length;i++){
            arr[i]=1;
        }
        for(int i=1;i<r.length;i++){
            if(r[i]>r[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        for(int i=r.length-2;i>=0;i--){
            if(r[i]>r[i+1]){
                arr[i]=Math.max(arr[i],arr[i+1]+1);
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}