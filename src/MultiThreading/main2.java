package MultiThreading;

public class main2 {
    static boolean isFive = false;

    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 50; i++) {
                        System.out.println(i);
                        if (i == 5) {
                            isFive = true;
                        }
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {}
            }
        });
        timer.start();


        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!isFive) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        });
        timer2.start();
    }
}
