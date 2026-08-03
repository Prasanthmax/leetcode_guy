// Last updated: 03/08/2026, 14:18:11
class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(i<=7){
                count++;
            }
            if(i>7 && i<=15){
                count+=2;
            }
            if(i>15 && i<=23){
                count+=3;
            }
            if(i>23){
                count+=4;
            }
        }
        return count;
    }
}