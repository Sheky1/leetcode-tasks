package tasks.easy;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char character = strs[0].charAt(i);
            for (String string : strs) {
                if (i > string.length() - 1 || string.charAt(i) != character) return result.toString();
            }
            result.append(character);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

}
