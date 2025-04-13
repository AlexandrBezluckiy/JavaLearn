package JavaLearn;

public class ChildBox extends ParentBox {
    private double weigth;

    public ChildBox() {
        super();
        double weight;
    }

    public ChildBox(double height, double width, double length, double weigth) {
        super(height, width, length);
        this.weigth = weigth;
    }

    public ChildBox(double size, double weight) {
        super(size);
        this.weigth = weight;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(" Вес: " + weigth);
    }
}
