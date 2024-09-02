class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0) st.push(asteroids[i]);
            else {
                while(!st.empty() &&st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.empty() &&st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.empty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            }
        }
        int[] narr = new int[st.size()];
        for (int i = narr.length - 1; i >= 0; i--) {
            narr[i] = st.pop(); // Pop elements from the stack in reverse order
        }

        return narr;
    }
}