class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        int n=nums.length;
        for(int i=n-count;i<n;i++){
            nums[i]=0;
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        
    }
}