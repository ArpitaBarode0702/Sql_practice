class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        // Edge case: array is empty
        if (n == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        // Edge case: array has one element
        if (n == 1) {
            return nums[0];
        }

        // Binary search for the minimum element
        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Directly return the result if we find the smallest element
            if ((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == n - 1 || nums[mid] < nums[mid + 1])) {
                return nums[mid];
            }

            // If the right half is sorted and the left half is not
            if (nums[mid] < nums[e]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return nums[s];
    }
}
