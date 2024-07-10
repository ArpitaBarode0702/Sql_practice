class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = -1;
        Map<Character, Integer> map = new HashMap<>();
        if(s.length()==0){
            return 0;
        }

        while (j < s.length()) {
            // Add the current character to the map
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            // If the number of distinct characters is less than K, just move the end pointer
            if (map.size() < j-i+1) {
                while (map.size() < j-i+1) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
            // If the number of distinct characters is exactly K, update the max length
            else if (map.size() == j-i+1) {
                max = Math.max(max, j - i + 1);
                j++;
            }
            // If the number of distinct characters exceeds K, reduce the window size
            
        }

        return max;
        
    }
}