// Last updated: 30/07/2026, 11:49:03
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        Map<String,Integer> map=new HashMap<>();
4        for(String s:s1.split(" ")){
5            map.put(s,map.getOrDefault(s,0)+1);
6        }
7        for(String s:s2.split(" ")){
8            map.put(s,map.getOrDefault(s,0)+1);
9        }
10        StringBuilder sb=new StringBuilder();
11        for(Map.Entry<String,Integer> entry:map.entrySet()){
12            if(entry.getValue()==1){
13                sb.append(entry.getKey()+" ");
14            }
15        }
16        String[] arr;
17        if(sb.length()==0){
18            arr=new String[0];
19        }
20        else{
21            arr=sb.toString().split(" ");
22        }
23        return arr;
24    }
25}