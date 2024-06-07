class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
      
         HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
     
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            if(s.size()==0){
              nextGreaterMap.put(nums2[i], -1);
            }
            else if(s.size()>0 && s.peek()>nums2[i]){
                nextGreaterMap.put(nums2[i], s.peek());
            }
            else if(s.size()>0 && s.peek()<=nums2[i]){
                while(s.size()>0 && s.peek()<=nums2[i]){
                    s.pop();
                }
                if(s.size()==0){
                    nextGreaterMap.put(nums2[i], -1);
                }
                else{
                    nextGreaterMap.put(nums2[i], s.peek());
                }
            }
            s.push(nums2[i]);
        }
         int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }
        
        return result;
        
    }
}