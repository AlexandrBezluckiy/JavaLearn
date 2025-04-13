import JavaLearn.Figure;
import JavaLearn.Trapezoid;
import JavaLearn.Triangle;

public class OOP_Inheritance2 {
    public static void main(String[] args) {
        Figure figure = new Figure(3,4);
        Triangle triangle = new Triangle(3,4,5);
        Trapezoid trapezoid = new Trapezoid(5,8,3);

        System.out.println("Площадь фигуры равна: " + figure.area());
        System.out.println("Площадь треугольника равна: " + triangle.area());
        System.out.println("Площадь трапеции равна: " + trapezoid.area());
    }
}
