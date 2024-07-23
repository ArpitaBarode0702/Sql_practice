class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=-1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        if(max==-1){
            return 1;
        }
        return max;
        
    }
}