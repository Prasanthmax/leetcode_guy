// Last updated: 14/07/2026, 14:42:53
class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toString(n,2);
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
        }
        s=new String(arr);
        int num=Integer.parseInt(s,2);
        return num;
    }
}