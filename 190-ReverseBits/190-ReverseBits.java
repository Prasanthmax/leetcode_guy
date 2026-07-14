// Last updated: 14/07/2026, 14:48:30
class Solution {
    public int reverseBits(int n) {
        // String binary=Integer.toString(n,2);
        // char[] arr=binary.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]=='1'){
        //         arr[i]='0';
        //     }
        //     else{
        //         arr[i]='1';
        //     }
        // }
        // binary=new String(arr);
        // int num=Integer.parseInt(binary,2);
        // return num;
        return Integer.reverse(n);
    }
}