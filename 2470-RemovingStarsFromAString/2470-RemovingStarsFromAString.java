// Last updated: 14/07/2026, 14:43:51
class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}