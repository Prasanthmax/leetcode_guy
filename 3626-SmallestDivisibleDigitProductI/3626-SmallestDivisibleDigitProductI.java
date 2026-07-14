// Last updated: 14/07/2026, 14:42:55
class Solution {
    public int smallestNumber(int n, int t) {
        int result=0; 
        while(true){
        int m=n;
        int temp=1;
        while(m!=0){
            temp*=m%10;
            m/=10;
        }
        if(temp%t==0){
            result=n;
            break;
        }
          n++;
        }
        return result;
    }
}