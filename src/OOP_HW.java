import JavaLearn.Human;

public class OOP_HW {
    public static void main(String[] args) {
        Human man1 = Human.set_param("Иван", 15, 86.7);
        Human man2 = Human.set_param("Олег", 19, 78.8);
        Human man3 = Human.set_param("Влад", 21, 93.4);
        Human man4 = Human.set_param("Гена", 25, 84.8);
        Human man5 = Human.set_param("Вася", 18, 67.1);

        double mid_age = (Human.get_age(man1) + Human.get_age(man2) + Human.get_age(man3) + Human.get_age(man4) + Human.get_age(man5)) / 5;
        System.out.println("Средний возраст: " + mid_age);
    }
}
