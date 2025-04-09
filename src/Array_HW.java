import java.util.Scanner;

public class Array_HW {
    public static void main(String[] args) {
        int br1;
        int br2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое меньшее целое число:");
        br1 = sc.nextInt();
        System.out.println("Введите второе большее целое число:");
        br2 = sc.nextInt();
        int value = br2 - br1 + 1; // +1 добавляется для того чтобы большее крайнее значение тоже было включено в массив.
        int[] ar1 = new int[value];
        int[] ar2 = new int[ar1.length];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = br1;
            br1++;
        }

        for (int j = 0; j < ar2.length; j++) {
            ar2[j] = ar1[ar1.length - 1 - j];
        }

        for (int l : ar2) {
            System.out.println(l);
        }
    }
}
