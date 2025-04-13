package JavaLearn;

public class Mouse extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Зерно");
    }

    public void run(){
        System.out.println("Мышь бежит");
    }
}
