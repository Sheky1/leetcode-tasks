package tasks.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 {

    public static int romanToInt(String s) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('I', 1);
        valueMap.put('V', 5);
        valueMap.put('X', 10);
        valueMap.put('L', 50);
        valueMap.put('C', 100);
        valueMap.put('D', 500);
        valueMap.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && valueMap.get(s.charAt(i)) < valueMap.get(s.charAt(i + 1))) {
                sum += (valueMap.get(s.charAt(i + 1)) - valueMap.get(s.charAt(i)));
                i++;
            } else sum += valueMap.get(s.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
