// Last updated: 14/07/2026, 14:46:40
class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int[] pos=new int[n];
        for(int i=0;i<n;i++){
            pos[row[i]]=i;
        }
        int ans=0;
        for(int i=0;i<n;i+=2){
            int first=row[i];
            int expected=(first%2==0)?first+1:first-1;;
            if(row[i+1]!=expected){
                ans++;
                int poss=pos[expected];
                pos[row[i+1]]=poss;
                pos[expected]=i+1;
                int temp=row[i+1];
                row[i+1]=row[poss];
                row[poss]=temp;
            }
        }
        return ans;
    }
}