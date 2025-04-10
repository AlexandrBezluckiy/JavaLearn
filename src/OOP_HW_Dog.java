import JavaLearn.Dog;

public class OOP_HW_Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.set_value("Bobik", "Russian oborzaya", 25);
        System.out.println(dog.info());
        System.out.println(dog.run());
    }
}
