// Last updated: 14/07/2026, 14:43:35
class Solution {
    public int passThePillow(int n, int time) {
        int turn=((n-1)*2);
        time%=turn;
        if(time<n) return time+1;
        return (turn-time+1);
    }
}