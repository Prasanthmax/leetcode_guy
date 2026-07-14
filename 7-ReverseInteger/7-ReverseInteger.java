// Last updated: 14/07/2026, 14:50:40
class Solution {
    public int reverse(int x) {
        int temp=1;
        if(x<0){
           x=x*(-1);
           temp=-1;
        }
        long y=0;
        while(x!=0){
            y= y*10+(x%10);
            x=x/10;
        }
        y*=temp;
        return (y<Integer.MIN_VALUE || y>Integer.MAX_VALUE)?0:(int)y;
    }
}