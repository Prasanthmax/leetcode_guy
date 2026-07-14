// Last updated: 14/07/2026, 14:45:57
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2!=0){
                num-=1;
                count++;
            }
            else{
                num/=2;
                count++;
            }
        }
        return count;
    }
}