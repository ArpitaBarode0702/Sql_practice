class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list=new ArrayList<>();
    Map<Integer, Integer> m = new HashMap<>();
    
    // Count the frequency of each element in the array
    for (int i = 0; i < nums.length; i++) {
        m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
    }
    
    // Check for a majority element
    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
        if (entry.getValue() > n / 3) {
        list.add(entry.getKey()); // Return the element, not the count
        }
    }
    
    // If no majority element found, return -1
    return list;
        
    }
}