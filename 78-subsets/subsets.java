import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int subset = 1 << n;  // This calculates 2^n
        
        for(int i = 0; i < subset; i++) {  // Iterate through all possible subsets
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j < nums.length; j++) {  // Check each bit position
                if ((i & (1 << j)) != 0) {  // If the j-th bit is set, include nums[j]
                    l.add(nums[j]);
                }
            }
            ans.add(l);  // Add the current subset to the result list
        }
        
        return ans;  // Return all subsets
    }
}
