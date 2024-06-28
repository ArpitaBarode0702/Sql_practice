class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0;
        int n = s.length();
        // Discard all leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle optional sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        int threshold = Integer.MAX_VALUE / 10;

        // Process numerical digits and avoid overflow
        while (i < n) {
            int digit = s.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            // Check for overflow
            if (result > threshold || (result == threshold && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
