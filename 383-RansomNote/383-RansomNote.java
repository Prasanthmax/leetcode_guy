// Last updated: 14/07/2026, 14:47:31
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[] ledger=new int[26];
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            ledger[c-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            ledger[c-'a']--;
            if(ledger[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}