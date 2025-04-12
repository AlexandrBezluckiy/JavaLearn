package JavaLearn;

public class Access {
    private double height;
    private double width;
    private double length;

    private Access(){
        height = 0;
        width = 0;
        length = 0;
    }

    private Access(double height, double weight, int length){
        this.height = height;
        this.width = weight;
        this.length = length;
    }

    private Access(double size){
        this.height = size;
        this.width = size;
        this.length = size;
    }

    public static Access set_param () {
        Access box = new Access();
        return box;
    }

    public static Access set_param (double height, double weight, int length) {
        Access box = new Access(height, weight, length);
        return box;
    }

    public static Access set_param (double size) {
        Access box = new Access(size);
        return box;
    }

    public String show_size() {
        return "Размеры: " + height + " * " + width + " * " + length;
    }

    public double get_height() {
        return height;
    }

    public double get_width() {
        return width;
    }

    public double get_length() {
        return length;
    }

    public void set_height(double height) {
        this.height = height;
    }

    public void set_width(double width) {
        this.width = width;
    }

    public void set_length(double length) {
        this.length = length;
    }
}
