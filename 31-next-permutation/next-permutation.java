class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;

        // Step 1: Find the rightmost element which is smaller than its next element
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the entire array
        if (ind == -1) {
            reverse(nums, 0, n - 1);
        } else {
            // Step 3: Find the smallest element on the right of ind which is larger than nums[ind]
            for (int i = n - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    // Swap the elements
                    int temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            // Step 4: Reverse the subarray from ind + 1 to the end of the array
            reverse(nums, ind + 1, n - 1);
        }
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
