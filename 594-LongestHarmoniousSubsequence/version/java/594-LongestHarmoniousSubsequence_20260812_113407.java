// Last updated: 12/08/2026, 11:34:07
1class Solution {
2    public int findLHS(int[] nums) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int i:nums){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        int sum=0;
8        for(int i=0;i<nums.length;i++){
9            if(map.containsKey(nums[i]+1)){
10                sum=Math.max(sum,map.get(nums[i])+map.get(nums[i]+1));
11            }
12        }
13        return sum;
14    }
15}