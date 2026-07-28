// Last updated: 28/07/2026, 16:30:52
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        Set<Character> set=new HashSet<>();
4        for(char c:jewels.toCharArray()){
5            set.add(c);
6        }
7        int count=0;
8        for(int i=0;i<stones.length();i++){
9            if(set.contains(stones.charAt(i))){
10                count++;
11            }
12        }
13        return count;
14    }
15}