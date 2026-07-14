// Last updated: 14/07/2026, 14:43:06
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>2){
                return false;
            }
        }
        return true;
    }
}