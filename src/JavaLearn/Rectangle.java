package JavaLearn;

public class Rectangle {
    int length;
    int width;

    public void set_param(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String get_volume() {
        return "Length: " + length + " Width: " + width;
    }

    public int get_perim() {
        return 2*(length + width);
    }

    public int get_square(){
        return length * width;
    }
}
