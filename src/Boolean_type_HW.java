public class Boolean_type_HW {
    public static void main(String[] args) {
        int time = 24;
        boolean night = time >= 23 || time <= 5;
        boolean good_wether = true;

        if (night) {
            System.out.println("Спать");
        }
        if (!night && good_wether) {
            System.out.println("Гулять");
        }
        if (!night && !good_wether) {
            System.out.println("Читать книгу");
        }

    }
}
