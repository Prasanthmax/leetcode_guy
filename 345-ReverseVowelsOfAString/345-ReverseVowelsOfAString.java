// Last updated: 28/07/2026, 16:28:49
class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        String vow="AEIOUaeiou";
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && vow.indexOf(arr[left])==-1){
                left++;
            }
            while(left<right && vow.indexOf(arr[right])==-1){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}