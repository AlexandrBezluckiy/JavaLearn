package JavaLearn;

public class Man2 {
    private String name;
    private String position;
    private int age;
    private double height;

    private Man2 (String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    public static Man2 create_man(String name, String position, int age, double height) {
        Man2 man = new Man2 (name, position, age, height);
        return man;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
