// Last updated: 03/08/2026, 14:22:07
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map=new HashMap<>();
        String[] arr=paragraph.split("\\W+");
        Set<String> set=new HashSet<>();
        for(String s: banned){
            String a=s.toLowerCase();
            set.add(a);
        }
        for(String s:arr){
            String a=s.toLowerCase();
            if(!set.contains(a)){
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        Map.Entry<String,Integer> temp=null;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(temp==null || entry.getValue()>temp.getValue()){
                temp=entry;
            }
        }
        return temp.getKey();
    }
}