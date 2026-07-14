// Last updated: 14/07/2026, 14:43:54
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                return c;
            }
            else{
                set.add(c);
            }
        }
        return 'a';
    }
}