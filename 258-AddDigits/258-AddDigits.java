// Last updated: 14/07/2026, 14:47:58
class Solution {
    public int addDigits(int num) {
        if(num<=9) return num;
        int res=num%9;
        return (num!=0&&res==0)?9:res;
    }
}