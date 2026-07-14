// Last updated: 14/07/2026, 14:47:08
class Solution {
    public int findComplement(int num) {
        int count=0;
        int temp=num;
        while(temp!=0){
            temp=temp>>1;
            count++;
        }
        int xor=(1<<count)-1;
        return xor^num;
    }
}