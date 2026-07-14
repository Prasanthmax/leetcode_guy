// Last updated: 14/07/2026, 14:50:27
class Solution {  
    public boolean isValid(String s) {  
        Stack<Character> st=new Stack<>();
        for (char i : s.toCharArray()) {  
            if (i=='('||i=='{'||i=='[') {  
                st.push(i);}
                else{
                if(!st.empty()){
                    if(i==')'&&st.pop()!='('){
                        return false;
                    }
                    if(i==']'&&st.pop()!='['){
                        return false;
                    }
                    if(i=='}'&&st.pop()!='{'){
                        return false;
                    }
                }
                else return false;
                }
    } 

if(st.empty()) return true;
return false;
    }
}
