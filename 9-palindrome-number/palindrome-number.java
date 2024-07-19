class Solution {
    public boolean isPalindrome(int x) {
        int digit=0;
        int temp=x;
        while(x>0){
            int rem=x%10;
            digit=digit*10+rem;
            x=x/10;
            
        }
        if(digit!=temp){
            return false;
        }
        return true;
        
    }
}