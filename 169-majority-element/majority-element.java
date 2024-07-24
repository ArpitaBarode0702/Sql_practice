class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            }
        for(Map.Entry<Integer,Integer> itr:m.entrySet()){
            if(itr.getValue()>n/2){
                return itr.getKey();
            }
        }
        return -1;
    }
}