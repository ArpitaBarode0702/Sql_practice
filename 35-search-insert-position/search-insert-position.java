class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
               return mid;
             }
            else if(nums[mid]<target){
                res=mid+1;
                s=mid+1;
                
            }
            else{
                res=mid;
                e=mid-1;
            }
        }
        return res;
    }
}