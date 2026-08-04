// Last updated: 04/08/2026, 12:45:15
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for (int i=0; i<indices.length; i++){
5            if (s.startsWith(sources[i],indices[i])){
6                map.put(indices[i],i);
7            }
8        }  
9        StringBuilder sb=new StringBuilder();
10        for (int i=0; i<s.length();){
11            if (!map.containsKey(i)){
12                sb.append(s.charAt(i));
13                i++;
14            } else { //replace chars
15                sb.append(targets[map.get(i)]); 
16                i+=sources[map.get(i)].length();
17            }
18        }
19        return sb.toString();
20    }
21}