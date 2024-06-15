class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int s=min(bloomDay);
        int e=max(bloomDay);
        int ans=-1;
       if (m * k > bloomDay.length) {
            return -1;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
        
    }
    public int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public int max(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

}