import JavaLearn.*;

import java.util.ArrayList;

public class OOP_Interface {
    public static void main(String[] args) {
    Puma puma = new Puma();
    CanRun inter_puma = puma;



/*
    Puma puma1 = new Puma();
    Puma puma2 = new Puma();

    Mouse mouse1 = new Mouse();
    Mouse mouse2 = new Mouse();

    Rabbit rabbit1 = new Rabbit();
    Rabbit rabbit2 = new Rabbit();

    ArrayList<CanRun> animals = new ArrayList<>();
    animals.add(puma1);
    animals.add(puma2);
    animals.add(mouse1);
    animals.add(mouse2);
    animals.add(rabbit1);
    animals.add(rabbit2);
    for (CanRun animal : animals) {
        animal.run();
    }
*/
/*
        Puma puma = new Puma();
        Mouse mouse = new Mouse();
        Bird bird = new Bird();
        Rabbit rabbit = new Rabbit();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(puma);
        animals.add(mouse);
        animals.add(bird);
        animals.add(rabbit);

        for (Animal animal : animals) {
            System.out.printf("Ест ");
            animal.eat();
        }

        puma.run();
        Puma puma1 = new Puma();
        Animal animal = puma1; // апкаст - приведение дочернего класса puma1 к родительскому классу animal.
                               // объект animal ссылается на объект puma1
        animal.eat();
        puma = (Puma) animal; // даункаст - приведение родительского класса к дочернему
        puma.run();
*/
    }
}
