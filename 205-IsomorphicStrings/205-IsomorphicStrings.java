// Last updated: 14/07/2026, 14:48:21
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr=s.toCharArray();
        char[] arr1=t.toCharArray();
        for(int i=0;i<arr.length;i++){
            char a=arr[i];
            char b=arr1[i];
            int c=0,d=0;
            for(int j=1+i;j<arr.length;j++){
            if(arr[j]==a) c++;
            if(arr1[j]==b) d++;
            if(c!=d) return false;
        }
        
    }
    return true;
  }
}