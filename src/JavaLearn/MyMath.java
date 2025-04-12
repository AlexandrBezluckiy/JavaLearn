package JavaLearn;

public class MyMath {
    private static final double PI = 3.14;

    public static int square(int num) {
        return num * num;
    }

    public static double length(int num) {
        return 2 * PI * num;
    }

    public static double area(int num) {
        return PI * num * num;
    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}
