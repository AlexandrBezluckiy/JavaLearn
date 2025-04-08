import java.util.Random;

public class float_double_HW {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Гипотенуза равна: " + (float) c);
    }
}
