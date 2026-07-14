// Last updated: 14/07/2026, 14:49:48
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        String a=arr[arr.length-1];
        return a.length();
    }
}