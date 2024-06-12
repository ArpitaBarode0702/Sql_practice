class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int last=search(nums,target,false);
        ans[0]=start;
        ans[1]=last;
        return ans;
    }
    public int search(int[] nums,int target,boolean forindex){
        int s=0;
        int e=nums.length-1;
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                res=mid;
                if(forindex){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return res;
    }
}