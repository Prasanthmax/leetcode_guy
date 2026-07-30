// Last updated: 30/07/2026, 11:26:26
1class Solution {
2    public String mostCommonWord(String paragraph, String[] banned) {
3        Map<String,Integer> map=new HashMap<>();
4        String[] arr=paragraph.split("\\W+");
5        Set<String> set=new HashSet<>();
6        for(String s: banned){
7            String a=s.toLowerCase();
8            set.add(a);
9        }
10        for(String s:arr){
11            String a=s.toLowerCase();
12            if(!set.contains(a)){
13                map.put(a,map.getOrDefault(a,0)+1);
14            }
15        }
16        Map.Entry<String,Integer> temp=null;
17        for(Map.Entry<String,Integer> entry:map.entrySet()){
18            if(temp==null || entry.getValue()>temp.getValue()){
19                temp=entry;
20            }
21        }
22        return temp.getKey();
23    }
24}