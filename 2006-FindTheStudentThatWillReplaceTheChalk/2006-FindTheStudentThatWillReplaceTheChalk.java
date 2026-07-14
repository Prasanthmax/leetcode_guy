// Last updated: 14/07/2026, 14:44:34
class Solution {
    public int chalkReplacer(int[] chalk, long k) {
        int n=chalk.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=chalk[i];
        }
        k=k%sum;
        for(int i=0;i<n;i++){
            if(k<chalk[i]){
                return i;
            }
            k-=chalk[i];
        }
        return 0;
    }
}