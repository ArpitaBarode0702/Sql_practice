class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=-2;
        
        for(int i=0;i<nums.length;i++){
          if(nums[i]==1){
              count++;
              max=Math.max(max,count);
          }
            else {
                count=0;
            }
        }
        if(max==-2){
            return 0;
        }
        return max;
    }
}