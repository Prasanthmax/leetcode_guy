// Last updated: 29/07/2026, 11:45:27
1class Solution {
2    public int findMaxLength(int[] nums) {
3        Map<Integer,Integer> map=new HashMap<>();
4        int max=0;
5        int sum=0;
6        map.put(0,-1);
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0){
9                sum--;
10            }
11            else{
12                sum++;
13            }
14            if(map.containsKey(sum)){
15            max=Math.max(max,i-map.get(sum));
16        }
17        else{
18            map.put(sum,i);
19        }
20        }
21        return max;
22    }
23}