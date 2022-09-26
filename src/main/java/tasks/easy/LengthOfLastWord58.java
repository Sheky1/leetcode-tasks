package tasks.easy;

public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;

        int currentWordLength = 0;
        boolean onWord = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ' && !onWord) {
                onWord = true;
                currentWordLength = 1;
            } else if (s.charAt(i) != ' ') {
                currentWordLength++;
            } else {
                onWord = false;
            }
        }
        return currentWordLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("  fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
