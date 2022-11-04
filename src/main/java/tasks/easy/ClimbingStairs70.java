package tasks.easy;

public class ClimbingStairs70 {

    public static int climbStairs(int n) {
        int one = 1, two = 1;
        for(int i = 0; i < n - 1; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

}
