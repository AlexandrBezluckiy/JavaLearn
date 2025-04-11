public class OOP_Constructor_Class {
    double height;
    double width;
    double length;

    OOP_Constructor_Class() {
        height = 10;
        width = 5;
        length = 7;
    }

    OOP_Constructor_Class(double height, double weight, double length) {
        this.height = height;
        this.width = weight;
        this.length = length;
    }

    OOP_Constructor_Class(double size) {
        this.height = size;
        this.width = size;
        this.length = size;
    }

    public double volume() {
        return height * width * length;
    }
}
