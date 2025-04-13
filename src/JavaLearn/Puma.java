package JavaLearn;

public class Puma extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Зверей");
    }

    public void run() {
        System.out.println("Пума бежит");
    }
}
