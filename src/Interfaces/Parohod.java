package Interfaces;

public class Parohod implements Name{
    public String name;

    Parohod(String name){
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("I'm Parohod " + name);
    }

    public void showInfo() {
        System.out.println("I'm Parohod " + name);
    }
}
