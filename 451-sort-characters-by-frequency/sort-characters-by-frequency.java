class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Convert the map to a list of entries
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

           list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedString.append(entry.getKey());
            }
        }
        return  sortedString.toString();
    }
}