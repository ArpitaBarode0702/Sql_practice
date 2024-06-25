class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<Character>();
        int ans=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                st.push(ch[i]);
            }
            if(ch[i]==')'){
                st.pop();
            }
            ans=Math.max(ans,st.size());
        }
        return ans;
        
    }
}