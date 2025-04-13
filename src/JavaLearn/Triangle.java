package JavaLearn;

public class Triangle extends Figure {
    double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double side) {
        super(side);
        this.c = side;
    }

    @Override
    public double area() {
        double p = (super.getA() + super.getB() + c) / 2;
        double s = Math.sqrt(p*(p - super.getA()) * (p - super.getB()) * (p - c));
        return s;
    }
}
