package JavaLearn;

public class RectColor extends Rect {
    private String color;

    public RectColor(double a, double b, String color) {
        super(a, b);
        this.color = color;
    }

    public RectColor(double side, String color) {
        super(side);
        this.color = color;
    }

    @Override
    public double area() {
        return super.getA() * super.getB();
    }

    public String getRectData() {
        String s = "Площадь прямоугольника равна " + area() + " Цвет: " + color;
        return s;
    }
}
