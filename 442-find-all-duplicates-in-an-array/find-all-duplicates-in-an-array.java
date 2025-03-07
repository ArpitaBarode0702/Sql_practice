class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();
    for(int a:nums){
        if(map.containsKey(a)){
            map.put(a,map.get(a)+1);
            if(map.get(a)==2){
                list.add(a);
            }
        }
        else{
            map.put(a,1);
        }
       
        
    }
    return list;
    }
}