class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && count==0){
                count++;
            }
            else if(s.charAt(i)=='(' && count>=1){
                sb.append(s.charAt(i));
                         count++;
            }
            else if(s.charAt(i)==')' && count>1) {
                sb.append(s.charAt(i));
                count--;
            }    
            else if(s.charAt(i)==')' && count==1){
                    count--;
                }
            
        }
        return sb.toString();
        
    }
}