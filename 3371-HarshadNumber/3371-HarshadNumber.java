// Last updated: 14/07/2026, 14:43:03
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=0,c=0;
        int b=x;
        while(x!=0){
            temp+=x%10;
            x/=10;
        }
        if(b%temp==0) return temp;
        else return -1;
    }
}