class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
    LinkedHashSet<Integer> h=new LinkedHashSet<>();
        for(int iter1:nums){
            h.add(iter1);
        }
       
        int index=0;
        for(int iter:h){
            nums[index++]=iter;
          
        }
     
        return h.size();
        
    }
}
