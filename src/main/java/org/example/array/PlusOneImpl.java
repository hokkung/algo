package org.example.array;

public class PlusOneImpl implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        int offset = 1;
        int cur = digits.length - 1;
        while (offset > 0) {
            if (digits[cur] == 9) {
                digits[cur] = 0;
                offset = 1;
            } else {
                digits[cur]++;
                offset = 0 ;
            }
            cur--;
            if (cur < 0) {
                break;
            }
        }

        if (offset == 0) {
            return digits;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        for (int i = 1; i < digits.length; i++) {
            res[i] = digits[i];
        }

        return res;
    }
}
