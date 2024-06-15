class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=max(piles);
        int ans=Integer. MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            int totalhrs=calculateTotalHours(piles,mid);
            if(totalhrs<=h){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
        
    }
    public int max(int[] arr){
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }
        return m;
    }
    public  int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
}