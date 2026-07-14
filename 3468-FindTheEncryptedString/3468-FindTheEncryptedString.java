// Last updated: 14/07/2026, 14:42:58
class Solution {
    public String getEncryptedString(String s, int k) {
        int a=s.length();
        String d=s;
        char[] arr1=d.toCharArray();
        char[] arr=s.toCharArray();
        for(int i=0;i<a;i++){
            int temp=(i+k)%a;
            arr[i]=arr1[temp];
        }
        String b=new String(arr);
         return b;
    }
}