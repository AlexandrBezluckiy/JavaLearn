import JavaLearn.Cat;
import JavaLearn.Lion;
import JavaLearn.CatFamily;

public class OOP_Inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

        cat.info();
        lion.info();

        cat.eat();
        lion.eat();
    }
}
