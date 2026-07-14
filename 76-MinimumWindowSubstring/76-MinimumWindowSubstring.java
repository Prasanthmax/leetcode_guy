// Last updated: 14/07/2026, 14:49:34
class Solution {
    public String minWindow(String s, String t) {
        if(s.isEmpty() || t.isEmpty()) return "";
        Map<Character,Integer> map=new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int need=map.size();
        int left=0;
        int have=0;
        int bestleft=-1;
        int min=Integer.MAX_VALUE;
        Map<Character,Integer> seen=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            seen.put(c,seen.getOrDefault(c,0)+1);
            if(map.containsKey(c) && map.get(c).equals(seen.get(c))){
                have++;
            }
            while(have==need){
                if((i-left+1)<min){
                    bestleft=left;
                    min=i-left+1;
                }
                char leftchar=s.charAt(left);
                seen.put(leftchar,seen.get(leftchar)-1);
                if(map.containsKey(leftchar) && seen.get(leftchar)<map.get(leftchar)){
                    have--;
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE ? "" : s.substring(bestleft,bestleft+min);
    }
}