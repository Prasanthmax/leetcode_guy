// Last updated: 14/07/2026, 14:43:28
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        if(a+d>=24){
            return (a+d)%24;
        }
        return a+d;
    }
}