// Last updated: 14/07/2026, 14:44:37
class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();
        int[] c=new int[26];
        if(arr.length<26){
            return false;
        }
        else{
        for(int i=0;i<arr.length;i++){
            c[arr[i]-'a']+=1;
            }
        }
        for(int i=0;i<26;i++){
            if(c[i]==0){
                return false;
            }
        }
        return true;
    }
}