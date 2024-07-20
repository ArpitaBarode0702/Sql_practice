class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            i++;
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}