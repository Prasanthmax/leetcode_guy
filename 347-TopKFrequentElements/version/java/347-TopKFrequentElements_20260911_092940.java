// Last updated: 11/09/2026, 09:29:40
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int i:nums){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        List<List<Integer>> bucket=new ArrayList<>(nums.length+1);
8        for(int i=0;i<=nums.length;i++){
9            bucket.add(new ArrayList<>());
10        }
11        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
12            int num=entry.getKey();
13            int freq=entry.getValue();
14            bucket.get(freq).add(num);
15        }
16        int[] res=new int[k];
17        int ind=0;
18        for(int i=nums.length;i>=1 && ind<k;i--){
19            for(int num:bucket.get(i)){
20                res[ind++]=num;
21                if(ind==k){
22                    return res;
23                }
24            }
25        }
26        return res;
27    }
28}