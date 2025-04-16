package MultiThreading;

public class main {
    public static void main(String[] args) {
//        RunnableTimer rt = new RunnableTimer();

        Thread timer = new Thread(new Runnable() {
            public void run() {
                try {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println(i);
                    Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {}
            }
        });
        timer.start();

        Thread timer2 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        System.out.println("Ку ку");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                }
            }
        });
        timer2.start();
/*
        for (int i = 0; i < 1000000; i++) {
            System.out.println("2");
        }
*/
    }
}
