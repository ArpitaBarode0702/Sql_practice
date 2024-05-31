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
    public int maximalRectangle(char[][] matrix) {
           if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix[0].length;
        int n = matrix.length;
        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Update the current heights array
                if (matrix[i][j] == '0') {
                    heights[j] = 0;
                } else {
                    heights[j] += 1;
                }
            }
            // Calculate the maximum rectangle area with the updated heights array
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }
    
}