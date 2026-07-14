// Last updated: 14/07/2026, 14:45:00
class Solution {
    public int maximumWealth(int[][] accounts) {
        int temp=0;
        for(int i=0;i<accounts.length;i++){
            int temp1=0;
            for(int j=0;j<accounts[0].length;j++){
                temp1+=accounts[i][j];
            }
            if(temp<temp1){
                temp=temp1;
            }
        }
        return temp;
    }
}