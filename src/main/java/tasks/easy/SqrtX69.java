package tasks.easy;

public class SqrtX69 {

    public static int mySqrt(int x) {
        return (int) Math.round(Math.sqrt(x));
    }

    public static int mySqrtBinarySearch(int x) {
        if (x < 2) return x;

        int low = 1;
        int high = x;

        while (low < high) {
            long mid = low + (long) Math.floor((high - low) / 2);
            if (mid * mid == x) return (int) mid;
            else if (mid * mid > x) high = (int) mid;
            else if (mid * mid < x) low = (int) (mid + 1);
        }

        return low - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrtBinarySearch(4));
    }
}
