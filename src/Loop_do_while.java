import java.util.Scanner;

public class Loop_do_while {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        String next;
        do {
            System.out.println("Ввести еще число? y/n");
            Scanner sc1 = new Scanner(System.in);
            next = sc1.next();
            if (!next.equals("y")) {
                continue;
            }
            do {
                System.out.println("Введите число от 1 до 10:");
                Scanner sc2 = new Scanner(System.in);
                a = sc2.nextInt();
                sum += a;
            } while (a < 1 || a > 10);
        } while (!next.equals("n"));
        System.out.println("Сумма введенных чисел равна: " + sum);
    }
}
