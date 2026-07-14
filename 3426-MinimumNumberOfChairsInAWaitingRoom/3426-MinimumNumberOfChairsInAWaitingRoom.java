// Last updated: 14/07/2026, 14:43:01
class Solution {
    public int minimumChairs(String s) {
        char[] arr=s.toCharArray();
        int n=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='L'){
                n--;
            }
            if(arr[i]=='E'){
                n++;
            }
            if(temp<n){
                temp=n;
            }
        }
        return temp;
    }
}