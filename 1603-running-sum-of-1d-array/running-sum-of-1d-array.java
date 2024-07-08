class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int ind=0;
        for(int i=0;i<nums.length;i++){
           sum[i]=ind+nums[i];
            ind=sum[i];
            
        }
        return sum;
        
    }
}