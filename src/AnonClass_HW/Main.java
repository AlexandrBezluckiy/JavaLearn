package AnonClass_HW;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Buhgalter buh = new Buhgalter();
        director.force(buh, 5);  // В этом случае строка вывода формируется в классе Buhgalter. Out выводится в классе Director.

// Решение через анонимный класс:
        director.force(new Counter() {  // В этом случае строка формируется здесь же в переопределнном методе report. Out выводится в классе Director.
            @Override
            public String report(int i) {
                String out = ("Отчет за " + i + " месяцев.");
                return out;
            }
        }, 7);
    }
}
