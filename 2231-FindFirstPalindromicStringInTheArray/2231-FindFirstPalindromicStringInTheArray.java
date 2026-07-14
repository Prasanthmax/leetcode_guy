// Last updated: 14/07/2026, 14:44:13
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            char[] arr=words[i].toCharArray();
            boolean br=true;
            int left=0;
            int right=arr.length-1;
            while(left<right){
                if(arr[left]!=arr[right]){
                    br=false;
                    break;
                }
                left++;
                right--;
            }
            if(br){
                return words[i];
            }
        }
        return "";
    }
}