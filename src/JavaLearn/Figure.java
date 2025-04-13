package JavaLearn;

public abstract class Figure {
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

    public abstract double area();

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
}
