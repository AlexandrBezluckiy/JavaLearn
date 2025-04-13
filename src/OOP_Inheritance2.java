import JavaLearn.Rect;
import JavaLearn.Trapezoid;
import JavaLearn.Triangle;

public class OOP_Inheritance2 {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 5);
        Triangle triangle = new Triangle(3,4,5);
        Trapezoid trapezoid = new Trapezoid(5,8,3);

        System.out.println("Площадь прямоугольника равна: " + rect.area());
        System.out.println("Площадь треугольника равна: " + triangle.area());
        System.out.println("Площадь трапеции равна: " + trapezoid.area());
    }
}
