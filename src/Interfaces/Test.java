package Interfaces;

public class Test {
    public static void main(String[] args) {
/* 1 пример
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Ikalay");
        animal1.sleep();  // собственный метод класса
        person1.sayHello();
        animal1.showInfo();  // метод реализующий интерфейс Info
        person1.showInfo();
*/

/* 2 пример
        Info info1 = new Animal(1);  //  Интерфейс позволяет создавать объекты общего типа для разных классов.
        Info info2 = new Person("Dick");  // что может быть использовано в ArrayList

//2.1 пример непосредственного вызова метода инетерфейса для объекта
        info1.showInfo();  // для объектов общего для нескольких классов типа можно вызывать метод определенный в интерфейсе
        info2.showInfo();

//    пример вызова метода определнного в мэйн, с последующим вызовом метода интерфейса.
        outputInfo(info1);  // для объектов общего для нескольких классов типа можно вызывать метод, где в качестве параметра
        outputInfo(info2);  // можно передавать объект общего типа для которого будет вызываться метод объявленный в интерфейсе.
*/

// 3 пример
        Animal animal1 = new Animal(1);  // реализует интерфейс Info
        Person person1 = new Person("Ualera");  // Реализует интерфейс Info, Name
        Parohod parohod1 = new Parohod("Hizenberg");  // Реализует интерфейс Name

        outputInfo(animal1); // на вход методу showInfo подается объект реализующий интерфейс Info, определенный для каждого класса.
        outputInfo(person1); //

//      outputInfo(parohod1); // -- метод интерфейса showName не определен для класса Parohod
//      Info info = new Parohod("Titanic"); // аналогично нельзя создать объект типа Info если Parohod не реализует интерфейс Info

        outPutName(parohod1);
        outPutName(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
    public static void outPutName(Name name) {
        name.sayMyName();
    }
}
