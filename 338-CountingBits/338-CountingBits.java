// Last updated: 14/07/2026, 14:47:40
class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=i;
            int count=0;
            while(num>0){
                count+=num&1;
                num>>=1;
            }
            arr[i]=count;
        }
        return arr;
    }
}