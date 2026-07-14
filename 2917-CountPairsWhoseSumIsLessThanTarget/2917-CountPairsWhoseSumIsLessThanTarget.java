// Last updated: 14/07/2026, 14:43:19
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size(),c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums.get(i)+nums.get(j))<target) c++;
            }
        }
        return c;
    }
}