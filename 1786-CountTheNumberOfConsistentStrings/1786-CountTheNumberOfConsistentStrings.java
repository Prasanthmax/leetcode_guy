// Last updated: 14/07/2026, 14:45:05
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          int num=0;
          for(String word:words){
            boolean consist=true;
            for(char s:word.toCharArray()){
                if(!allowed.contains(word.valueOf(s))){
                    consist=false;
                    break;
                }
            }
            if(consist){
                num++;
            }
          }
          return num;
    }
}