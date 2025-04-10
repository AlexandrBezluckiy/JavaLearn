public class OOP_HW2 {
    public static void main(String[] args) {
        OOP_HW2_Man man1 = new OOP_HW2_Man();
        man1.name = "Ivan";
        man1.age = 15;
        man1.weight = 87.7;

        OOP_HW2_Man man2 = new OOP_HW2_Man();
        man2.name = "Oleg";
        man2.age = 17;
        man2.weight = 57.4;

        OOP_HW2_Man man3 = new OOP_HW2_Man();
        man3.name = "Vlad";
        man3.age = 21;
        man3.weight = 85.3;

        OOP_HW2_Man man4 = new OOP_HW2_Man();
        man4.name = "Kolya";
        man4.age = 22;
        man4.weight = 93.8;

        OOP_HW2_Man man5 = new OOP_HW2_Man();
        man5.name = "Boris";
        man5.age = 19;
        man5.weight = 87.7;

        double midle_age = (man1.age + man2.age + man3.age + man4.age + man5.age) / 5;
        System.out.println("Средний возраст: " + midle_age);
    }
}
