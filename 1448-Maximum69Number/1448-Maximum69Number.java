// Last updated: 14/07/2026, 14:45:54
class Solution {
    public int maximum69Number (int num) {
        String s=num+"";
        int n=s.length();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i)-'0';
        }
        for(int i=0;i<n;i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        int a=0;
        for(int i=0;i<n;i++){
            a=a*10+arr[i];
        }
        return a;
    }
}