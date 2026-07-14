// Last updated: 14/07/2026, 14:46:12
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr=new int[60];
        int res=0;
        for(int t:time){
            res+=arr[(600-t)%60];
            arr[t%60]+=1;
        }
        return res;
    }
}