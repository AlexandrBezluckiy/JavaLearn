import JavaLearn.Method2;

public class OOP_Overload_Method2 {
    public static void main(String[] args) {
        Method2 box1 = new Method2(3.33);
        System.out.println(box1.value());

        Method2 box2 = new Method2(3);
        System.out.println(box2.value());

        Method2 box3 = new Method2(3.33, 3.33, 3.33);
        System.out.println(box3.value());

        Method2 box4 = new Method2(3, 3, 3);
        System.out.println(box4.value());

        box4.set_size(15.1,15.1,15.1);
    }
}
