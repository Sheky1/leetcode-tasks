package tasks.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeNumber9 {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        List<Integer> numbers = new ArrayList<>();
        int currentNumber = x;
        while (currentNumber > 0) {
            int number = currentNumber % 10;
            numbers.add(number);
            currentNumber /= 10;
        }
        for (int i = 0; i < numbers.size() / 2 + 1; i++) {
            if (!Objects.equals(numbers.get(i), numbers.get(numbers.size() - i - 1))) return false;
        }
        return true;
    }

    public static boolean isPalindromeNoArray(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        long divider = 1;
        while (x >= divider * 10) {
            divider *= 10;
        }
        while(x > 0) {
            long firstNumber = x / divider;
            long lastNumber = x % 10;
            System.out.println(firstNumber + " " + lastNumber);
            if(firstNumber != lastNumber) return false;
            x %= divider;
            x /= 10;
            divider /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(121121));
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindromeNoArray(121));
        System.out.println(isPalindromeNoArray(121121));
        System.out.println(isPalindromeNoArray(1001));
        System.out.println(isPalindromeNoArray(12321));
        System.out.println(isPalindromeNoArray(1410110141));
    }

}
