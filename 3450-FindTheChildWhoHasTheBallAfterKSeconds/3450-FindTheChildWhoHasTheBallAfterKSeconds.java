// Last updated: 14/07/2026, 14:42:59
class Solution {
    public int numberOfChild(int n, int k) {
        int a=k/(n-1);
        int b=k%(n-1);
        if(a%2==1){
            return n-1-b;
        }
        return b;
    }
}