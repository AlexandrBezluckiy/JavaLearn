import JavaLearn.Rectangle;

public class OOP_HW_Rectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.set_param(9, 16);
        System.out.println(rec.get_volume());
        System.out.println("Периметр прямоугольника: " + rec.get_perim());
        System.out.println("Площадь прямоугольника: " + rec.get_perim());
    }
}
