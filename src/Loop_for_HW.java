public class Loop_for_HW {
    public static void main(String[] args) {
        for(int i = 100; i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 2 == 1)) {
                System.out.println(i);
            }
        }
    }
}
