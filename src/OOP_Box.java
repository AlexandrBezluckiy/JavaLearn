public class OOP_Box {

    double length;
    double width;
    double height;
// Конструктор без параметров.
    OOP_Box() {
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }
// Конструктор с параметрами.
    OOP_Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
// Конструктор с одним параметром
    OOP_Box(double size) {
        this.length = size;
        this.width = size;
        this.height = size;
    }

    public double get_volume (OOP_Box box) {
        return box.length * box.height * box.width;
    }
}
