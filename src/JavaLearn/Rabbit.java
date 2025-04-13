package JavaLearn;

public class Rabbit extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Морковь");
    }

    @Override
    public void run() {
        System.out.println("Кролик бежит");
    }
}
