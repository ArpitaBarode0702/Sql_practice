class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
              arr[i]=-1;
            for(int j=i+1;j<=i+n-1;j++){
              
                int ind=j%n;
                if(nums[ind]>nums[i]){
                    arr[i]=nums[ind];
                    break;
                }
                
            }
        }
        return arr;
        
    }
}