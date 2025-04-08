public class Integer_variables_types {
    public static void main(String[] args) {
        int days = 10;
        final int speed = 300000; // переменная задана как константа
        final int sec_in_days = 86400;
        long seconds = days * sec_in_days;
        long distance = seconds * speed;
        System.out.println("Пройденное расстояние за " + days + " дней, равно " + distance + " километров.");

        System.out.println("\nПример с переполнением переменной тип byte (от -128 до 127)");
        byte a = 127;
        a++;
        System.out.println(a);

        //Обратное приведение типов
        int i = 15;
        byte j = (byte) i;
        System.out.println(j);
    }
}
