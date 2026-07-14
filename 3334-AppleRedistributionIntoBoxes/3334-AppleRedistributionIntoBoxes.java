// Last updated: 14/07/2026, 14:43:04
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int temp=0;
        int c=1;
        for(int i=0;i<apple.length;i++){
            temp+=apple[i];
        }
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>0;i--){
            if((temp-=capacity[i])>0) c++;
        }
        return c;
    }
}