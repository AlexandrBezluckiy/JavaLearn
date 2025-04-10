package JavaLearn;

public class Human {
    String name;
    int age;
    double weight;

    public Human() {
        this.name = "";
        this.age = 0;
        this.weight = 0;
    }

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static Human set_param(String name, int age, double weight) {
        Human man = new Human(name, age, weight);
        return man;
    }
     public static int get_age(Human what_man) {
        return what_man.age;
     }
}
