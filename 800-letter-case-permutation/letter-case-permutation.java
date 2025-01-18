class Solution {
    public List<String> letterCasePermutation(String s) {
        String input=s;
        String output="";
        ArrayList<String> l=new ArrayList<>();
        solve(input,output,l);
        return l;
        
    }
    void solve(String in,String out,ArrayList<String> res){
        if(in.length()==0){
            res.add(out);
            return;
        }
        if(Character.isLetter(in.charAt(0))){
            String out1=out;
            String out2=out;
            out1=out1+Character.toUpperCase(in.charAt(0));
            out2=out2+Character.toLowerCase(in.charAt(0));
            in=in.substring(1);
            solve(in,out1,res);
            solve(in,out2,res);
        }
        else{
            String out1=out;
            out1=out1+in.charAt(0);
            in=in.substring(1);

            solve(in,out1,res);
        }
    }
}