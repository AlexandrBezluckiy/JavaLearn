package JavaLearn;

public class Figure {
    private double a;
    private double b;

    public Figure(double side) {
        this.a = side;
        this.b = side;
    }

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
}
