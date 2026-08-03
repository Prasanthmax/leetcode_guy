// Last updated: 03/08/2026, 14:26:32
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[]ch=s.toCharArray();
            Arrays.sort(ch);
            String ss=String.valueOf(ch);
            if(!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            map.get(ss).add(s);
        }
        return new ArrayList<>(map.values());
    }
}