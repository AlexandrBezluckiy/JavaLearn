package JavaLearn;

import java.awt.*;

public class Trapezoid extends Figure {
    private double h;

    public Trapezoid(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    public Trapezoid(double side) {
        super(side);
        this.h = side;
    }

    @Override
    public double area() {
        return ((getA() + getB()) * h) / 2;
    }
}
