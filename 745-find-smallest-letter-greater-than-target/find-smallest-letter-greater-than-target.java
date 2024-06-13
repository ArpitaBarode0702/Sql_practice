class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]==target){
                s=mid+1;
            }
            else if(letters[mid]>target){
                res=letters[mid];
                e=mid-1;
            }
            else if(letters[mid]<target){
                s=mid+1;
            }
        }
        return res;
    }
}