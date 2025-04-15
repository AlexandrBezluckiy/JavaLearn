package Anon_Class;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
/*
        Povar povar = new Povar();
        director.force(povar);
*/
        director.force(new Cookable() {    // создает объект интерфейса, для которого переопределяем существующий для интерфейса метод.
            @Override
            public void cook() {
                System.out.println("Готовлю.");
            }
        });
    }
}
