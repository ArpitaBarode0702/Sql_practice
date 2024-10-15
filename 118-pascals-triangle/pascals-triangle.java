class Solution {
    public List<Integer> generaterow(int row){
        ArrayList<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(1);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/(i);
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            l.add(generaterow(i));
        }
        return l;
    }
}