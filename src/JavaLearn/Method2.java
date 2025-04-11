package JavaLearn;

public class Method2 {
    double height;
    double weight;
    double length;

    public Method2(double height, double weight, double length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
    public Method2(int height, int weight, int length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
    public Method2(double size) {
        this.height = size;
        this.weight = size;
        this.length = size;
    }
    public Method2(int size) {
        this.height = size;
        this.weight = size;
        this.length = size;
    }

    public void set_size(double height, double weight, double length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

public void set_size(int height, int weight, int length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
}
    public double value(){
        return height * weight * length;
    }

}
