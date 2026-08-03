// Last updated: 03/08/2026, 14:18:08
class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        for(int i=0;i<word.length();i++){
            int c=word.charAt(i)-'a';
            arr[c]++;
        }
        Arrays.sort(arr);
        int count=0;
        int temp=0;
        for(int i=arr.length-1;i>=0;i--){
            if(temp<8){
                count+=arr[i]*1;
                temp++;
            }
            else if(temp<16){
                count+=arr[i]*2;
                temp++;
            }
            else if(temp<24){
                count+=arr[i]*3;
                temp++;
            }
            else{
                count+=arr[i]*4;
            }
        }
        return count;
    }
}