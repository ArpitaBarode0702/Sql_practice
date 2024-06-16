class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=max(nums);
        int ans=-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            if(fundivisum(nums,mid)<=threshold){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
    }
    public int fundivisum(int[] arr,int d){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum += Math.ceil((double)(arr[i]) / (double)(d));
        }
        return sum;
    }
    public int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}