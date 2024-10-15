class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int) ans);
        for (int i = 0; i < rowIndex; i++) {
            ans = ans * (rowIndex - i);
            ans = ans / (i + 1);
            list.add((int) ans);
        }
        return list;
        
    }
}