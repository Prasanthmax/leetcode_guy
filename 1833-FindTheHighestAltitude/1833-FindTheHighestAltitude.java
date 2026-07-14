// Last updated: 14/07/2026, 14:44:56
class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int temp=0;
        for(int i=0;i<gain.length;i++){
            temp+=gain[i];
            sum=Math.max(sum,temp);
        }
        return sum;
    }
}