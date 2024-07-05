class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder nsb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            sb.reverse();
            nsb.append(sb);
            if (i < arr.length - 1) {
                nsb.append(" ");
            }
        }
        return nsb.toString();
    }
}
