// Last updated: 14/07/2026, 14:43:50
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0){
            return n*2;
        }
        return n;
    }
}