class Solution {
    public int max(int[] weights){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            maxi=Math.max(maxi,weights[i]);
        }
        return maxi;
    }
     public int sumof(int[] weights){
         int sum=0;
         for(int i=0;i<weights.length;i++){
             sum+=weights[i];
         }
         return sum;
     }
    
    public int shipWithinDays(int[] weights, int days) {
        int s=max(weights);
        int e=sumof(weights);
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(requiredday(weights,mid)<=days){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return ans;
    }
    public int requiredday(int[] wt,int cap){
        int days=1;
        int load=0;
        for(int i=0;i<wt.length;i++){
            if(load+wt[i]>cap){
                days=days+1;
                load=wt[i];
            }
            else{
                load=wt[i]+load;
            }
        }
        return days;
    }
    
}