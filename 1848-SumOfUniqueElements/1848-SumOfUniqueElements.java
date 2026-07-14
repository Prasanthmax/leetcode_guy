// Last updated: 14/07/2026, 14:44:52
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int num:nums){
            s.put(num,s.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int num:s.keySet()){
            if(s.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
}