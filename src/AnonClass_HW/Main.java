package AnonClass_HW;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Buhgalter buh = new Buhgalter();
        director.force(buh, 5);

        director.force(new Counter() {
            @Override
            public String report(int i) {
                String out = ("Отчет за " + i + " месяцев.");
                return out;
            }
        }, 7);
    }
}
