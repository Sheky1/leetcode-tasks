package tasks.easy;

import java.util.Arrays;

public class PlusOne66 {

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int nineCounter = 0;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) nineCounter++;
                else break;
            }
            int[] toReturn = new int[nineCounter == digits.length ? digits.length + 1 : digits.length];
            if (nineCounter == digits.length) {
                toReturn[0] = 1;
                for (int i = 1; i < toReturn.length; i++) {
                    toReturn[i] = 0;
                }
            } else {
                for (int i = 0; i < digits.length; i++) {
                    if (i >= digits.length - nineCounter) {
                        toReturn[i] = 0;
                    } else if (i == digits.length - nineCounter - 1) {
                        toReturn[i] = digits[i] + 1;
                    } else {
                        toReturn[i] = digits[i];
                    }
                }
                toReturn[toReturn.length - 1] = 0;
            }
            return toReturn;
        }
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }

    public static int[] plusOneBest(int[] digits) {
        int[] reversed = reverse(digits, digits.length);
        int register = 1;
        for(int i = 0; i < reversed.length; i++) {
            int total = register + reversed[i];
            if(total > 9) {
                register = 1;
                reversed[i] = 0;
            } else {
                register = 0;
                reversed[i] = total;
            }
        }
        int[] toReturn = reverse(reversed, reversed.length);
        if(register == 1) {
            int[] longerResult = new int[toReturn.length + 1];
            longerResult[0] = 1;
            System.arraycopy(toReturn, 0, longerResult, 1, toReturn.length);
            return  longerResult;
        }
        return  toReturn;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 2})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    static int[] reverse(int a[], int n) {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        int[] reversed = new int[n];
        for (k = 0; k < n; k++) {
            reversed[k] = a[k];
        }
        return reversed;
    }
}
