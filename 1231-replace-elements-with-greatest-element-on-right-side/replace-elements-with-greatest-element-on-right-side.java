class Solution {
    public int[] replaceElements(int[] arr) {
         int n = arr.length;
    int max = -1; // Initialize max to -1 for the last element
    
    // Traverse the array from right to left
    for (int i = n - 1; i >= 0; i--) {
        int current = arr[i]; // Store current element before it is replaced
        arr[i] = max; // Replace current element with the max element to its right
        if (current > max) {
            max = current; // Update max if current element is greater
        }
    }
    
    return arr;
    }
}