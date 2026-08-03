// Last updated: 03/08/2026, 14:17:04
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map=new HashMap<>();
4        for(String s:strs){
5            char[]ch=s.toCharArray();
6            Arrays.sort(ch);
7            String ss=String.valueOf(ch);
8            if(!map.containsKey(ss)){
9                map.put(ss,new ArrayList<>());
10            }
11            map.get(ss).add(s);
12        }
13        return new ArrayList<>(map.values());
14    }
15}