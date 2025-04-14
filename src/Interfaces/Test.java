package Interfaces;

public class Test {
    public static void main(String[] args) {
/* 1
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Ikalay");

        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();
*/

/* 2
        Info info1 = new Animal(1);
        Info info2 = new Person("Dick");
//2.1
        info1.showInfo();
        info2.showInfo();
//

        outputInfo(info1);
        outputInfo(info2);
*/
// 3
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Ualera");

        outputInfo(animal1); // на вход методу showInfo подается объект реализующий интерфейс Info, определенный для каждого класса.
        outputInfo(person1); //
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
