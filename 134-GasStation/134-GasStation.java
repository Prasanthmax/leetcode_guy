// Last updated: 14/07/2026, 14:49:05
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int small=0;
        int large=0;
        int current=0;
        for(int i=0;i<gas.length;i++){
            int temp=gas[i]-cost[i];
            current+=temp;
            large+=temp;
            if(current<0){
                small=i+1;
                current=0;
            }
        }
        if(large<0){
                return -1;
            }
        return small;
    }
}