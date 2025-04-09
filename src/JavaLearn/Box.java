package JavaLearn;

public class Box {
    double length;
    double width;
    double height;

    public void set_value (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void get_value() {
        System.out.println(length + " " + width + " " + height);
    }

    public double get_volume (Box box) {
        return length * width * height;
    }

}
