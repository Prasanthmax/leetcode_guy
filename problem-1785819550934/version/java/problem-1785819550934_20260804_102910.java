// Last updated: 04/08/2026, 10:29:10
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> list=new ArrayList<>();
4        int min=Integer.MAX_VALUE;
5        int max=0;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]>max){
8                max=nums[i];
9            }
10            if(nums[i]<min){
11                min=nums[i];
12            }
13        }
14        Set<Integer> set=new HashSet<>();
15        for(int i:nums){
16            set.add(i);
17        }
18        for(int i=min+1;i<max;i++){
19            if(!set.contains(i)){
20                list.add(i);
21            }
22        }
23        return list;
24    }
25}