class Solution {
    public boolean isValid(String s1) {
        Stack<Character> stack=new Stack<>();
        char[] s=s1.toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]=='(' || s[i]=='[' || s[i]=='{'){
                stack.push(s[i]);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char ch=stack.peek();
                stack.pop();
                if((s[i]==')' && ch=='(') || (s[i]=='}' && ch=='{') || (s[i]==']' && ch=='['))                 {
                    
                }
                else{
                    return false;
                }
            }
        }
            if(stack.isEmpty()){
                return true;
            }
          
                return false;
            
        
    }
}