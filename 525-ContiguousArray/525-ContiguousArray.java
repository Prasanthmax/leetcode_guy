// Last updated: 03/08/2026, 14:22:54
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)){
            max=Math.max(max,i-map.get(sum));
        }
        else{
            map.put(sum,i);
        }
        }
        return max;
    }
}