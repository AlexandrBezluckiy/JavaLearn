package JavaLearn;

public class ParentBox {
    private double height;
    private double width;
    private double length;

    public ParentBox() {
        this.height = 0;
        this.width = 0;
        this.length = 0;
    }

    public ParentBox(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public ParentBox(double size) {
        this.height = size;
        this.width = size;
        this.length = size;
    }

    public void setSize(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void showInfo() {
        System.out.printf("Height: " + height + " Width: " + width + " Length: " + length);
    }


}
