package JavaLearn;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;
/*
    public CatFamily() {
        ears = 2;
        legs = 4;
        bigClaws = true;
    }
*/
    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void info() {
        System.out.println("Ушей: " + ears + " Лап: " + legs + " Большие когти: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.printf("Кушаю ");
    }
}
