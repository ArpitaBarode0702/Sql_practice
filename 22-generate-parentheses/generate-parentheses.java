class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> l=new ArrayList<>();
        int open=n;
        int close=n;
        String op="";
        solve(open,close,op,l);
        return l;
        
    }
    void solve(int open,int close,String outp,ArrayList<String> result){
        if(open==0 &&close==0){
            result.add(outp);
            return;
        }
        if(open!=0){
            String op1=outp;
            op1=op1+'(';
            solve(open-1,close,op1,result);
        }
        if(close>open){
            String op2=outp;
            op2=op2+')';
            solve(open,close-1,op2,result);
        }
        return;
    }
}