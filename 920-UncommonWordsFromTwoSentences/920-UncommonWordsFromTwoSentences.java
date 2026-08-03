// Last updated: 03/08/2026, 14:21:58
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();
        for(String s:s1.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                sb.append(entry.getKey()+" ");
            }
        }
        String[] arr;
        if(sb.length()==0){
            arr=new String[0];
        }
        else{
            arr=sb.toString().split(" ");
        }
        return arr;
    }
}