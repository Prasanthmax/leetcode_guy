// Last updated: 14/07/2026, 14:45:30
class Solution {
    public int countOdds(int low, int high) {
        int n=high-low+1;
        if(n%2==0){
            return n/2;
        }
        else if(n%2!=0){
            if((low%2!=0) || (high%2!=0)){
                return n/2+1;
            }
            else{
                return n/2;
            }
        }
        return n/2;
    }
}