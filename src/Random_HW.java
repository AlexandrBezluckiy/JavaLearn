import java.util.Random;

public class Random_HW {
    public static void main(String[] args) {
/*
    int num;
    for (int i = 0; i < 1000; i++) {
        num = (int) (Math.random() * 90 + 10);
        if (num < 10) {
        System.out.println(i + " " + num);
        break;
        }
    }

    Random random = new Random();
    int nums2 = random.nextInt(10, 100);
    System.out.println(nums2);
*/
    int num = (int) (Math.random() * 90 + 10);
    String out = String.format("Число от 10 до 100 равно: %s", num );
    System.out.println(out);
    }
}
