// Last updated: 14/07/2026, 14:43:29
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes){
            return k;
        }
        if(k>numOnes){
            k-=numOnes;
            if(k<=numZeros){
                return numOnes;
            }
            k-=numZeros;
            return numOnes-k;
        }
        return k;
    }
}