// Last updated: 14/07/2026, 14:47:51
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return 0;
    }
}