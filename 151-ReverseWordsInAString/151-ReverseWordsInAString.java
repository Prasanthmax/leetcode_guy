// Last updated: 14/07/2026, 14:48:44
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>0;i--){
            sb.append(arr[i]+" ");
        }
        sb.append(arr[0]);
        return sb.toString();
    }
}