class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;
        digits[n - 1]++;
        for (int i = n - 1; i >= 0; i--) {
            carry = digits[i] / 10 ;
            digits[i] = digits[i] % 10;
            if(carry> 0 && (i - 1) >= 0){
                digits[i - 1] += carry;
            }
        }
        if (carry > 0) {
            int[] arr = new int[n + 1];
            arr[0] = carry;
            for (int i = 1; i < n + 1; i++) {
                    arr[i] = digits[i - 1];
            }
            return arr;
        } else {
            return digits;
        }
    }
}
