public class Loop_while {
    public static void main(String[] args) {
/*
        int i = 1;
        while (i <= 1000) {
            System.out.println(i);
            i++;
        }

        byte a = 0;
        boolean b = a >= 0;
        while (b) {
            System.out.println(a);
            a++;
            if (a < 0) {
                b = false;
            }
        }
*/
        int i = 1000;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
