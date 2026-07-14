// Last updated: 14/07/2026, 14:50:16
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor ==-1){
            return Integer.MAX_VALUE;
        }
         int a=dividend/divisor;
        return a;
    }
}