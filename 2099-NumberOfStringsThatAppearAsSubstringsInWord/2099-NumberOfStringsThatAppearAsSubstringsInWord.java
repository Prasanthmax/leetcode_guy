// Last updated: 14/07/2026, 14:44:24
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s: patterns){
            if(word.contains(s)){
                count++;
            }
        }
        return count;
    }
}