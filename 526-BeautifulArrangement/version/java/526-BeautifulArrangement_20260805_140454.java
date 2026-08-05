// Last updated: 05/08/2026, 14:04:54
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> list=new ArrayList<>();
4        Map<Integer,Integer> map=new HashMap<>();
5        for(int i:nums){
6            map.put(i,map.getOrDefault(i,0)+1);
7        }
8        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
9            if(entry.getValue()>1){
10                list.add(entry.getKey());
11            }
12        }
13        return list;
14    }
15}