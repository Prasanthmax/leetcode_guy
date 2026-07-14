// Last updated: 14/07/2026, 14:45:40
class Solution {
    public double average(int[] salary) {
        int min=salary[0],max=salary[0];
        int n=salary.length;
        double avg=0;
        int c=0;
        for(int i=0;i<salary.length;i++){
            if(max<salary[i]){
                max=salary[i];
            }
            if(min>salary[i]){
                min=salary[i];
            }
        }
        for(int i=0;i<n;i++){
            avg+=salary[i];
            if(salary[i]!=min && salary[i]!=max){
                c++;
            }
        }
        avg=avg-(min+max);
        return avg/c;
    }
}