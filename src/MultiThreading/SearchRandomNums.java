package MultiThreading;
import java.util.Random;

public class SearchRandomNums {

    static boolean search = false;

    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100);
        System.out.println("Выпало число: " + secret);
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                int count = 0;
                try {
                    while (!search) {
//                        System.out.println(count);
                        count++;
                        Thread.sleep(10);
                    }
                } catch (Exception e) {}
                System.out.println("Угадано с " + count + " попытки.");
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                int j;
                try{
                    while (!search) {
                        j = rand.nextInt(100);
                        if (j == secret ) {
                            System.out.println("Совпадение найдено: " + j);
                            search = true;
                        }
                        Thread.sleep(10);
                    }
                }   catch (Exception e) {}
            }
        });
        t2.start();
    }
}
