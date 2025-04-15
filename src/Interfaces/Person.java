package Interfaces;

public class Person implements Info, Name {
    public String name;

    Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void showInfo() {
        System.out.println("My name is " + this.name);
    }

    public void sayMyName() {
        System.out.println("I'm " + this.name);
    }


}
