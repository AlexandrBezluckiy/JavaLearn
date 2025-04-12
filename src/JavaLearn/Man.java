package JavaLearn;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show_info () {
        System.out.println("Имя: " + name + "\nВозраст: " + age);
    }

    public void set_age(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Возраст не может быть меньше нуля.");
        }
    }
    public int get_age() {
        return age;
    }

    public String get_name() {
        return name;
    }
}
