class Solution {
    public int search(int[] nums, int target) {
        
        int index=findMin(nums);
        
        
        
        
        int elem1=binarysearch(nums,0,index-1,target);
        int elem2=binarysearch(nums,index,nums.length-1,target);
        if(elem1!=-1){
            return elem1;
            
        }
        
            return elem2;
        
        
    }
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
                return mid;
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
    public int binarysearch(int[] nums,int s,int e,int t){
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                return mid;
            }
            else if(nums[mid]<t){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}