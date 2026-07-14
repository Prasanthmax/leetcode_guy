// Last updated: 14/07/2026, 14:47:37
class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<=right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}