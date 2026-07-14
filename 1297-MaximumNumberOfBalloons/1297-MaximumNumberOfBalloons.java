// Last updated: 14/07/2026, 14:46:04
class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] chr={'b','a','l','o','n'};
        int[] arr=new int[5];
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            if(chr[i]=='l'|| chr[i]=='o'){
                arr[i]=map.getOrDefault(chr[i],0)/2;
            }
            else{
                arr[i]=map.getOrDefault(chr[i],0);
            }
            sum=Math.min(sum,arr[i]);
        }
        return sum;
    }
}