class Solution {
    
       static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Pair> s = new Stack<>();
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int pseudo1 = -1;
        int pseudo2 = n;

        // NSL (Nearest Smaller to Left)
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && s.peek().value >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left[i] = pseudo1;
            } else {
                left[i] = s.peek().index;
            }
            s.push(new Pair(heights[i], i));
        }

        // Clear the stack to reuse it for NSR
        s.clear();

        // NSR (Nearest Smaller to Right)
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek().value >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                right[i] = pseudo2;
            } else {
                right[i] = s.peek().index;
            }
            s.push(new Pair(heights[i], i));
        }

        // Calculate width and area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

}