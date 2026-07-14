// Last updated: 14/07/2026, 14:46:50
class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<op.length;i++){
        if(!op[i].equals("C") && !op[i].equals("D") && !op[i].equals("+")){
            stk.push(Integer.parseInt(op[i]));
        }
        if(op[i].equals("C")){
            stk.pop();
        }
        if(op[i].equals("D")){
            stk.push(2*stk.peek());
        }
        if(op[i].equals("+")){
            int temp=stk.pop();
            int tp=temp+stk.peek();
            stk.push(temp);
            stk.push(tp);
            }
        }
        int sum=0;
        for(int sc:stk){
            sum+=sc;
        }
        return sum;
    }
}