// Last updated: 14/07/2026, 14:48:27
class Solution {
    public int hammingWeight(int n) {
        int a=0;
        String binary=Integer.toString(n,2);
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                a++;
            }
        }
        return a;
    }
}