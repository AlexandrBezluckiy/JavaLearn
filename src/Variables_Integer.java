public class Variables_Integer {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("a + b  = " + (a+b) );
        c += 5;
        c *= 2;
        System.out.println("c = " + c);

        int i = 10;
        int j = 3;
        int k = i / j;
        System.out.println("k = " + k + " (результат целочисленного деления " + i + " на " + j + ")");
        int l = i % j;
        System.out.println("l = " + l + " (остаток от деления " + i + " на " + j + ")");
    }
}
