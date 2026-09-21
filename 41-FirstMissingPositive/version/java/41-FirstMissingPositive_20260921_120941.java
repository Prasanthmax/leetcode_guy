// Last updated: 21/09/2026, 12:09:41
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Set<Integer> set=new HashSet<>();
4        for(int i:nums){
5            if(i>0){
6                set.add(i);
7            }
8        }
9        for(int i=1;i<=set.size();i++){
10            if(!set.contains(i)){
11                return i;
12            }
13        }
14        return set.size()+1;
15    }
16}