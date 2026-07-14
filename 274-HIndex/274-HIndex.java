// Last updated: 14/07/2026, 14:47:53
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int temp=citations.length-i;
            if(citations[i]>=temp){
                return temp;
            }
        }
        return 0;
    }
}