// Last updated: 14/07/2026, 14:44:18
class Solution {
    public boolean winnerOfGame(String colors) {
        char[] arr=colors.toCharArray();
        int count=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i-1] && arr[i]==arr[i+1] && arr[i]=='A'){
                count++;
            }
            if(arr[i]==arr[i-1] && arr[i]==arr[i+1] && arr[i]=='B'){
                count--;
            }
        }
        return (count>0);
    }
}