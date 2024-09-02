class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = nextSmaller(arr); // Next smaller element
        int[] pse = prevSmaller(arr); // Previous smaller element
        int total = 0;
        int mod = 1000000007;

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i]; // Distance to previous smaller element
            int right = nse[i] - i; // Distance to next smaller element
            total = (int) (total + (right * left * 1L * arr[i]) % mod) % mod;
        }
        return total;
    }

    // Method to calculate next smaller element's index
    public int[] nextSmaller(int[] A) {
        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            res[i] = A.length; // Default value is the length of array (no smaller element)
        }

        for (int i = A.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek(); // Store the index of the next smaller element
            }
            st.push(i); // Push current index
        }
        return res;
    }

    // Method to calculate previous smaller element's index
    public int[] prevSmaller(int[] A) {
        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            res[i] = -1; // Default value is -1 (no smaller element)
        }

        for (int i = 0; i < A.length; i++) {
            while (!st.isEmpty() && A[st.peek()] > A[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek(); // Store the index of the previous smaller element
            }
            st.push(i); // Push current index
        }
        return res;
    }
}
