package MultiThreading;

public class clock {

    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            public void run() {
                String time;
                try {
                    while (true) {
                        for (int hh = 0; hh < 24; hh++) {
                            for (int mm = 0; mm < 60; mm++) {
                                for (int ss = 0; ss < 60; ss++) {
                                    time = String.format("%02d:%02d:%02d", hh, mm, ss);
                                    System.out.println(time);
                                    Thread.sleep(1000);
                                }
                            }
                            if ((hh+1) == 24) {
                                hh = -1;
                            }
                        }
                    }
                } catch (Exception e) {}
            }
        });
        timer.start();
    }
}
