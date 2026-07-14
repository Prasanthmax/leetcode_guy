// Last updated: 14/07/2026, 14:44:19
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String str:operations){
            if(str.equals("++X")){
                x++;
            }
            if(str.equals("X++")){
                x++;
            }
            if(str.equals("--X")){
                x--;
            }
            if(str.equals("X--")){
                x--;
            }
        }
        return x;
    }
}