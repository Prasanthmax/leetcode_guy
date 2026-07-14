// Last updated: 14/07/2026, 14:47:28
class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return (char) ('a'+i);
            }
        }
        return ' ';
    }
}