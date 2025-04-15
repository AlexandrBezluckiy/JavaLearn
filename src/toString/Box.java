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
//        String str = "Ширина: " + width + "\n" + "Высота: " + height + "\n" + "Длина: " + length;
        String str = String.format("Ширина: %s\nДлина: %s\nВысота: %s\n", width, height, length);
        return str;
    }
}
