// Last updated: 14/07/2026, 14:50:35
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] arr1={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<arr1.length;i++){
            while(num>=arr[i]){
                num-=arr[i];
                sb.append(arr1[i]);
            }

        }
        return sb.toString();
    }
}