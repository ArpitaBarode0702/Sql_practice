class Solution {
    public String removeKdigits(String num, int k) {
    int l=num.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<l;i++){
            while(!st.empty() && k>0 && st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k=k-1;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
            if(st.isEmpty()){
                return "0";
            }
            StringBuilder sb=new StringBuilder();
            while(!st.empty()){
               sb.append(st.pop());
            }
            sb.reverse();
       while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        // Step 5: If the result is empty, return "0"
        if (sb.length() == 0) {
            return "0";
        }
        
        return sb.toString();
    }
}