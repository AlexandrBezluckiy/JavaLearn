package JavaLearn;

public class Rect extends Figure {

    public Rect (double a, double b) {
        super(a, b);
    }

    public Rect (double side) {
        super(side);
    }

    @Override
    public double area() {
        return super.getA() * super.getB();
    }


}
