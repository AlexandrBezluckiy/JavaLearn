public class Loop_while {
    public static void main(String[] args) {
/*
// Выводим значения от 0 до 1000
        int i = 1;
        while (i <= 1000) {
            System.out.println(i);
            i++;
        }

// Выводим только положительные значения для переменной типа byte используя переполнение переменной и логическую переменную
        byte a = 0;
        boolean b = a >= 0;
        while (b) {
            System.out.println(a);
            a++;
            if (a < 0) {
                b = false;
            }
        }

// Выводим четные числа от 1000 до 0

        int i = 1000;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
*/
// Считаем среднее арифметическое всех чисел от 0 до 100
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println((float) sum/i);
    }
}
