// Last updated: 14/07/2026, 14:42:48
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int lt=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            lt=Math.min(lt,landStartTime[i]+landDuration[i]);
        }
        int water=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            int temp=Math.max(lt,waterStartTime[i]);
            water=Math.min(water,temp+waterDuration[i]);
        }
        int wt=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            wt=Math.min(wt,waterStartTime[i]+waterDuration[i]);
        }
        int land=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int temp=Math.max(wt,landStartTime[i]);
            land=Math.min(land,temp+landDuration[i]);
        }
        return Math.min(land,water);
    }
}