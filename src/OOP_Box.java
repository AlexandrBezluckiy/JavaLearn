public class OOP_Box {

    double length;
    double width;
    double height;

    OOP_Box() {
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    OOP_Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    OOP_Box(double size) {
        this.length = size;
        this.width = size;
        this.height = size;
    }
}
