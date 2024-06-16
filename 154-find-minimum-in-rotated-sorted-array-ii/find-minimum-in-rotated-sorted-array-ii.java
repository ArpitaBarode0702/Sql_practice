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
        while (s < e) {
            int mid = s + (e - s) / 2;

            if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else if(nums[mid] < nums[e]){
                e=mid;
            }
            else{
                e--;
            }
        }

        return nums[s];
    }
}