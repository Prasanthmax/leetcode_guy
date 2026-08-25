// Last updated: 25/08/2026, 21:03:52
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        int mis=0;
4        Map<Integer,Integer> map=new HashMap<>();
5        for(int i:nums){
6            map.put(i,map.getOrDefault(i,0)+1);
7        }
8        for(int i=1;i<=101;i++){
9            if(!map.containsKey(k*i)){
10                return k*i;
11            }
12        }
13        return 0;
14    }
15}