// Last updated: 14/07/2026, 14:43:41
class Solution {
    public int countDigits(int num) {
        int tum=num;
        int sum=0;
        while(tum!=0){
            int temp=tum%10;
            if(num%temp==0){
                sum++;
            }
            tum/=10;
        }
        return sum;
    }
}