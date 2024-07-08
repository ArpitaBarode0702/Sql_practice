class Solution {
    public int dominantIndex(int[] nums) {
        // If the array is empty, return -1
        if (nums.length == 0) {
            return -1;
        }

        // Find the maximum element and its index
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Check if the maximum element is at least twice as large as every other element
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
