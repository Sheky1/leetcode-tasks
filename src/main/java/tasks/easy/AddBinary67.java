package tasks.easy;

public class AddBinary67 {

    public static String addBinary(String a, String b) {
        int shorterString = Math.min(a.length(), b.length());
        StringBuilder inverseResult = new StringBuilder();
        int register = 0;
        String aInverse = new StringBuilder(a).reverse().toString();
        String bInverse = new StringBuilder(b).reverse().toString();
        for (int i = 0; i < shorterString; i++) {
            int total = register + (aInverse.charAt(i) - '0') + (bInverse.charAt(i) - '0');
            if (total == 0) inverseResult.append('0');
            else if (total == 1) {
                inverseResult.append('1');
                register = 0;
            } else if (total == 2) {
                inverseResult.append('0');
                register = 1;
            } else {
                inverseResult.append('1');
                register = 1;
            }
        }
        if (a.length() > b.length()) {
            register = getRegister(shorterString, inverseResult, register, aInverse);
        } else {
            register = getRegister(shorterString, inverseResult, register, bInverse);
        }
        if (register == 1) inverseResult.append('1');
        return inverseResult.reverse().toString();
    }

    public static String addBinaryBest(String a, String b) {
        StringBuilder inverseResult = new StringBuilder();
        int register = 0;
        String aInverse = new StringBuilder(a).reverse().toString();
        String bInverse = new StringBuilder(b).reverse().toString();
        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int digitA = i < a.length() ? aInverse.charAt(i) - '0' : 0;
            int digitB = i < b.length() ? bInverse.charAt(i) - '0' : 0;
            int total = register + digitA + digitB;
            register = total > 1 ? 1 : 0;
            inverseResult.append(total % 2);
        }
        if (register == 1) inverseResult.append('1');
        return inverseResult.reverse().toString();
    }

    private static int getRegister(int longerString, StringBuilder inverseResult, int register, String aInverse) {
        for (int i = longerString; i < aInverse.length(); i++) {
            int total = register + (aInverse.charAt(i) - '0');
            if (total == 0) inverseResult.append('0');
            else if (total == 1) {
                inverseResult.append('1');
                register = 0;
            } else {
                inverseResult.append('0');
                register = 1;
            }
        }
        return register;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinaryBest("11", "1"));
        System.out.println(addBinaryBest("1010", "1011"));
    }
}
