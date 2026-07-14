// Last updated: 14/07/2026, 14:42:46
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int lt=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            lt=Math.min(lt,landStartTime[i]+landDuration[i]);
        }
        int wt=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            wt=Math.min(wt,waterStartTime[i]+waterDuration[i]);
        }
        int t1=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            int temp=Math.max(lt,waterStartTime[i]);
            t1=Math.min(t1,temp+waterDuration[i]);
        }
        int t2=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int temp=Math.max(wt,landStartTime[i]);
            t2=Math.min(t2,temp+landDuration[i]);
        }
        return Math.min(t1,t2);
    }
}