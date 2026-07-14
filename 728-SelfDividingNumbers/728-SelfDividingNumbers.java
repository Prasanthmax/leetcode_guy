// Last updated: 14/07/2026, 14:46:37
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(self(i)){
                list.add(i);
            }
        }
        return list;
    }
    private  boolean self(int i){
        boolean res=true;
        int temp=i;
        while(temp!=0){
            int t=temp%10;
            if(t!=0 && i%t==0){
                res=true;
            }
            else{
                res=false;
                break;
            }
            temp/=10;
        }
        return res;
    }
}