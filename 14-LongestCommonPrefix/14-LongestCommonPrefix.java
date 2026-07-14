// Last updated: 14/07/2026, 14:50:33
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(pre)){
                pre=pre.substring(0,pre.length()-1);
            }
            if(pre.isEmpty()){
                return "";
            }
        }
        return pre;
    }
}