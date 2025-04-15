import java.util.Random;
import java.util.Scanner;

public class createRandom {
    public static void main(String[] args) {
//  1 способ:
        double random = Math.random();
        int randomInt = (int) (random * 10 + 1);
        System.out.println(randomInt);
// 2 способ
        Random rand = new Random();
        int i = rand.nextInt(1, 10);
        System.out.println(i);

// Просто пример ввода числа пользователем.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число сам: ");
        int num  = sc.nextInt();
        System.out.println(num);
    }
}
