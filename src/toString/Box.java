package toString;

public class Box {
    public double height;
    public double width;
    public double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        String str = "Ширина: " + height + "\n" + "Высота: " + width + "\n" + "Длина: " + length;
        return str;
    }
}
