class Solution {
    public int characterReplacement(String s, int k) {
        int j = 0;
        int i = 0;
        int maxlen = 0;  // Initialized to 0 since we want to find the maximum length
        int maxfre = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxfre = Math.max(maxfre, map.get(s.charAt(j)));
            
            if ((j - i + 1) - maxfre <= k) {
                maxlen = Math.max(maxlen, j - i + 1);
                j++;
            } else {
                while ((j - i + 1) - maxfre > k) {
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        
        return maxlen;
    }
}
