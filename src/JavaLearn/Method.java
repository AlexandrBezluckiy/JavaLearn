package JavaLearn;

public class Method {
    public static  double calc_mid(double a, double b) {
        double res = (a + b)/2;
        return res;
    }
    public static double calc_mid(double a, double b, double c) {
        double res = (a + b + c)/3;
        return res;
    }
    public static double calc_mid(double a, double b, double c, double d) {
        double res = (a + b + c + d) / 4;
        return res;
    }
    public static double calc_mid(double... args) {
        double res = 0;
        for (int i = 0; i < args.length; i++) {
            res += args[i];
        }
        res = res / args.length;
        return res;
    }
}
